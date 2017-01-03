package com.kinbiko.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JapaneseNameFormatter {

    public String format(String name) {
        if (name == null)
            return "";
        List<String> splits = getSplits(name);
        for (Iterator<String> iterator = splits.iterator(); iterator.hasNext();)
            if(iterator.next().contains("."))
                iterator.remove();
        if (splits.size() <= 1)
            return name;
        return String.format("%s, %s", splits.get(1), splits.get(0));
    }

    private List<String> getSplits(String name) {
        return new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
    }
}
