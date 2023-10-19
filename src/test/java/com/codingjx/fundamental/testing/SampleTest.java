package com.codingjx.fundamental.testing;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SampleTest {
    @Test
    public void testHashMapStringString() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", null);
        map.put("c", "");
        map.put("d", " ");

        System.out.println("map.get(\"a\") --> " + map.get("a"));
        System.out.println("map.get(\"b\") --> " + map.get("b"));
        System.out.println("map.get(\"c\") --> " + map.get("c"));
        System.out.println("map.get(\"d\") --> " + map.get("d"));
        System.out.println("map.get(\"e\") --> " + map.get("e"));
    }

    @Test
    public void testBooleanUtilsToBoolean() {
        HashMap<String, String> map = new HashMap<>();
        map.put("true", "true");
        map.put("True", "True");
        map.put("TRUE", "TRUE");
        map.put("spacetrue", " true ");
        map.put("spaceTrue", " True ");
        map.put("spaceTRUE", " TRUE ");

        map.put("false", "false");
        map.put("False", "False");
        map.put("FALSE", "FALSE");
        map.put("spacefalse", " false ");
        map.put("spaceFalse", " False ");
        map.put("spaceFALSE", " FALSE ");

        map.put("null", null);

        map.put("empty", "");
        map.put("space", " ");
        map.put("random", "random");
        map.put("y", "y");
        map.put("Y", "Y");
        map.put("n", "n");
        map.put("N", "N");

        map.put("t", "t");
        map.put("T", "T");
        map.put("f", "f");
        map.put("F", "F");

        map.put("o", "o");
        map.put("O", "O");

        System.out.println("BooleanUtils.toBoolean(map.get(\"true\")) = " + BooleanUtils.toBoolean(map.get("true")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"True\")) = " + BooleanUtils.toBoolean(map.get("True")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"TRUE\")) = " + BooleanUtils.toBoolean(map.get("TRUE")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spacetrue\")) = " + BooleanUtils.toBoolean(map.get("spacetrue")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spaceTrue\")) = " + BooleanUtils.toBoolean(map.get("spaceTrue")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spaceTRUE\")) = " + BooleanUtils.toBoolean(map.get("spaceTRUE")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"false\")) = " + BooleanUtils.toBoolean(map.get("false")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"False\")) = " + BooleanUtils.toBoolean(map.get("False")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"FALSE\")) = " + BooleanUtils.toBoolean(map.get("FALSE")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spacefalse\")) = " + BooleanUtils.toBoolean(map.get("spacefalse")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spaceFalse\")) = " + BooleanUtils.toBoolean(map.get("spaceFalse")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"spaceFALSE\")) = " + BooleanUtils.toBoolean(map.get("spaceFALSE")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"null\")) = " + BooleanUtils.toBoolean(map.get("null")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"empty\")) = " + BooleanUtils.toBoolean(map.get("empty")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"space\")) = " + BooleanUtils.toBoolean(map.get("space")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"random\")) = " + BooleanUtils.toBoolean(map.get("random")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"y\")) = " + BooleanUtils.toBoolean(map.get("y")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"Y\")) = " + BooleanUtils.toBoolean(map.get("Y")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"n\")) = " + BooleanUtils.toBoolean(map.get("n")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"N\")) = " + BooleanUtils.toBoolean(map.get("N")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"t\")) = " + BooleanUtils.toBoolean(map.get("t")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"T\")) = " + BooleanUtils.toBoolean(map.get("T")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"f\")) = " + BooleanUtils.toBoolean(map.get("f")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"F\")) = " + BooleanUtils.toBoolean(map.get("F")));

        System.out.println("BooleanUtils.toBoolean(map.get(\"o\")) = " + BooleanUtils.toBoolean(map.get("o")));
        System.out.println("BooleanUtils.toBoolean(map.get(\"O\")) = " + BooleanUtils.toBoolean(map.get("O")));
    }

    @Test
    public void testBooleanParseBoolean() {        HashMap<String, String> map = new HashMap<>();
        map.put("true", "true");
        map.put("True", "True");
        map.put("TRUE", "TRUE");
        map.put("tRuE", "tRuE");
        map.put("spacetrue", " true ");
        map.put("spaceTrue", " True ");
        map.put("spaceTRUE", " TRUE ");
        map.put("spacetRuE", " tRuE ");

        System.out.println("Boolean.parseBoolean(map.get(\"true\")) = " + Boolean.parseBoolean(map.get("true")));
        System.out.println("Boolean.parseBoolean(map.get(\"True\")) = " + Boolean.parseBoolean(map.get("True")));
        System.out.println("Boolean.parseBoolean(map.get(\"TRUE\")) = " + Boolean.parseBoolean(map.get("TRUE")));
        System.out.println("Boolean.parseBoolean(map.get(\"tRuE\")) = " + Boolean.parseBoolean(map.get("tRuE")));
        System.out.println("Boolean.parseBoolean(map.get(\"spacetrue\")) = " + Boolean.parseBoolean(map.get("spacetrue")));
        System.out.println("Boolean.parseBoolean(map.get(\"spaceTrue\")) = " + Boolean.parseBoolean(map.get("spaceTrue")));
        System.out.println("Boolean.parseBoolean(map.get(\"spaceTRUE\")) = " + Boolean.parseBoolean(map.get("spaceTRUE")));
        System.out.println("Boolean.parseBoolean(map.get(\"spacetRuE\")) = " + Boolean.parseBoolean(map.get("spacetRuE")));
        System.out.println();

        map.put("false", "false");
        map.put("False", "False");
        map.put("FALSE", "FALSE");
        map.put("fALsE", "fALsE");
        map.put("spacefalse", " false ");
        map.put("spaceFalse", " False ");
        map.put("spaceFALSE", " FALSE ");
        map.put("spacefALsE", " fALsE ");

        System.out.println("Boolean.parseBoolean(map.get(\"false\")) = " + Boolean.parseBoolean(map.get("false")));
        System.out.println("Boolean.parseBoolean(map.get(\"False\")) = " + Boolean.parseBoolean(map.get("False")));
        System.out.println("Boolean.parseBoolean(map.get(\"FALSE\")) = " + Boolean.parseBoolean(map.get("FALSE")));
        System.out.println("Boolean.parseBoolean(map.get(\"fALsE\")) = " + Boolean.parseBoolean(map.get("fALsE")));
        System.out.println("Boolean.parseBoolean(map.get(\"spacefalse\")) = " + Boolean.parseBoolean(map.get("spacefalse")));
        System.out.println("Boolean.parseBoolean(map.get(\"spaceFalse\")) = " + Boolean.parseBoolean(map.get("spaceFalse")));
        System.out.println("Boolean.parseBoolean(map.get(\"spaceFALSE\")) = " + Boolean.parseBoolean(map.get("spaceFALSE")));
        System.out.println("Boolean.parseBoolean(map.get(\"spacefALsE\")) = " + Boolean.parseBoolean(map.get("spacefALsE")));
        System.out.println();

        map.put("null", null);
        System.out.println("Boolean.parseBoolean(map.get(\"null\")) = " + Boolean.parseBoolean(map.get("null")));
        System.out.println();

        map.put("empty", "");
        map.put("space", " ");
        map.put("random", "random");

        System.out.println("Boolean.parseBoolean(map.get(\"empty\")) = " + Boolean.parseBoolean(map.get("empty")));
        System.out.println("Boolean.parseBoolean(map.get(\"space\")) = " + Boolean.parseBoolean(map.get("space")));
        System.out.println("Boolean.parseBoolean(map.get(\"random\")) = " + Boolean.parseBoolean(map.get("random")));
        System.out.println();

        map.put("y", "y");
        map.put("Y", "Y");
        map.put("n", "n");
        map.put("N", "N");
        System.out.println("Boolean.parseBoolean(map.get(\"y\")) = " + Boolean.parseBoolean(map.get("y")));
        System.out.println("Boolean.parseBoolean(map.get(\"Y\")) = " + Boolean.parseBoolean(map.get("Y")));
        System.out.println("Boolean.parseBoolean(map.get(\"n\")) = " + Boolean.parseBoolean(map.get("n")));
        System.out.println("Boolean.parseBoolean(map.get(\"N\")) = " + Boolean.parseBoolean(map.get("N")));
        System.out.println();

        map.put("t", "t");
        map.put("T", "T");
        map.put("f", "f");
        map.put("F", "F");
        System.out.println("Boolean.parseBoolean(map.get(\"t\")) = " + Boolean.parseBoolean(map.get("t")));
        System.out.println("Boolean.parseBoolean(map.get(\"T\")) = " + Boolean.parseBoolean(map.get("T")));
        System.out.println("Boolean.parseBoolean(map.get(\"f\")) = " + Boolean.parseBoolean(map.get("f")));
        System.out.println("Boolean.parseBoolean(map.get(\"F\")) = " + Boolean.parseBoolean(map.get("F")));
        System.out.println();

        map.put("on", "on");
        map.put("ON", "ON");
        map.put("o", "o");
        map.put("O", "O");
        System.out.println("Boolean.parseBoolean(map.get(\"on\")) = " + Boolean.parseBoolean(map.get("on")));
        System.out.println("Boolean.parseBoolean(map.get(\"ON\")) = " + Boolean.parseBoolean(map.get("ON")));
        System.out.println("Boolean.parseBoolean(map.get(\"o\")) = " + Boolean.parseBoolean(map.get("o")));
        System.out.println("Boolean.parseBoolean(map.get(\"O\")) = " + Boolean.parseBoolean(map.get("O")));
        System.out.println();
    }

    @Test
    public void testNumberParsing() {
        System.out.println(Integer.parseInt("1"));
        System.out.println(Integer.parseInt(null));
    }

    @Test
    public void testNumberUtilsParsing() {
        System.out.println(NumberUtils.isParsable("22"));
        System.out.println(NumberUtils.isParsable(""));
        System.out.println(NumberUtils.isParsable(" "));
        System.out.println(NumberUtils.isParsable(null));
        System.out.println(NumberUtils.isParsable("-1"));
    }

}
