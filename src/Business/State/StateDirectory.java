/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;
import Business.State.SanitationDepartment;
import Business.State.State;

/**
 *
 * @author VAIBHAV RAJ
 */
public class StateDirectory {
    private ArrayList<State> stateList;

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }
    
    
    public StateDirectory(){
        stateList=new ArrayList<State>();
    }
    
     public State createAndAddState(String name,State.DepartmentType type){
        State state=null;
        if(type==State.DepartmentType.Sanitation){
           // state=new SanitationDepartment(name);
            stateList.add(state);
        }
        return state;
    }
}
