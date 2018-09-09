package fi.espoo.teppo.dwgtoswgconverter;

import com.sun.java.util.jar.pack.Package;

public class DWGtoSVGConverter {
    Process p;
    public File convert(File file) {
        File svgfile = p.Runtime.getRuntime().exec("~/aechack/libredwg/program/dwg2SVG" + file);
    }
}
