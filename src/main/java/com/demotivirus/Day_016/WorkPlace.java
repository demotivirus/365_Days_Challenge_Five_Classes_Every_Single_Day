package com.demotivirus.Day_016;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WorkPlace {
    private List<Work> workList;

    public void addWork(Work work){
        checkWorklistInit();
        workList.add(work);
    }

    public void addWorks(Work... works){
        checkWorklistInit();
        for (Work w : works)
            workList.add(w);
    }

    private void checkWorklistInit(){
        if (workList == null)
            workList = new ArrayList<>();
    }
}
