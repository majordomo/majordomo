package de.altimos.mdsd.majordomo;

import java.util.LinkedList;
import java.util.List;

public class CheckXtends {

	static public boolean hasRecursiveReferences(PreparedStatement stmt) {
		List<PreparedStatement> reachedStatements = new LinkedList<PreparedStatement>();
		reachedStatements.add(stmt);
		return hasRecursiveReferences(stmt, reachedStatements);
	}
	
	static public boolean hasRecursiveReferences(PreparedStatement stmt, List<PreparedStatement> referenced) {
		if(stmt == null) return false;

		List<StatementReference> refs = findAllDirectReferences(stmt.getStatement());
		
		for(StatementReference ref : refs) {
			if(referenced.contains(ref.getRef())) {
				// Already referenced prepared statement found. Abort.
				return true;
			}
			
			referenced.add(ref.getRef());
		}

		for(StatementReference ref : refs) {
			if(hasRecursiveReferences(ref.getRef(), referenced)) {
				return true;
			}
		}
		
		return false;
	}
	
	static public List<StatementReference> findAllDirectReferences(Statement stmt) {
		List<StatementReference> refs = new LinkedList<StatementReference>();
		
		if(stmt instanceof BinaryOperation) {
			BinaryOperation bo = (BinaryOperation) stmt;
			refs.addAll(findAllDirectReferences(bo.getLeft()));
			refs.addAll(findAllDirectReferences(bo.getRight()));
		}
		if(stmt instanceof NotOperation) {
			return findAllDirectReferences(((NotOperation) stmt).getStatement());
		}
		if(stmt instanceof StatementReference) {
			refs.add((StatementReference) stmt);
		}
		
		return refs;
	}
	
	static public boolean hasRecursiveReferences(PreparedActionSet stmt) {
		List<PreparedActionSet> reachedStatements = new LinkedList<PreparedActionSet>();
		reachedStatements.add(stmt);
		return hasRecursiveReferences(stmt, reachedStatements);
	}
	
	static public boolean hasRecursiveReferences(PreparedActionSet stmt, List<PreparedActionSet> referenced) {
		if(stmt == null) return false;

		List<ActionSetReference> refs = new LinkedList<ActionSetReference>();
		
		for(Action action : stmt.getActions()) {
			if(action instanceof ActionSetReference) {
				refs.add((ActionSetReference) action);
			}
		}
		
		for(ActionSetReference ref : refs) {
			if(referenced.contains(ref.getRef())) {
				// Already referenced prepared action set found. Abort.
				return true;
			}
			
			referenced.add(ref.getRef());
		}

		for(ActionSetReference ref : refs) {
			if(hasRecursiveReferences(ref.getRef(), referenced)) {
				return true;
			}
		}
		
		return false;
	}

	static public boolean hasRecursiveReferences(PreparedValue stmt) {
		List<PreparedValue> reachedStatements = new LinkedList<PreparedValue>();
		reachedStatements.add(stmt);
		return hasRecursiveReferences(stmt, reachedStatements);
	}
	
	static public boolean hasRecursiveReferences(PreparedValue stmt, List<PreparedValue> referenced) {
		if(stmt == null) return false;

		List<ValueReference> refs = new LinkedList<ValueReference>();
		
		if(stmt.getValue() instanceof ValueReference) {
			refs.add((ValueReference) stmt.getValue());
		}
		
		for(ValueReference ref : refs) {
			if(referenced.contains(ref.getRef())) {
				// Already referenced prepared action set found. Abort.
				return true;
			}
			
			referenced.add(ref.getRef());
		}

		for(ValueReference ref : refs) {
			if(hasRecursiveReferences(ref.getRef(), referenced)) {
				return true;
			}
		}
		
		return false;
	}


}
