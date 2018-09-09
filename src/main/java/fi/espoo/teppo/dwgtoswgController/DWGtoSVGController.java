package fi.espoo.teppo.dwgtoswgController;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import fi.espoo.teppo.dwgtoswgconverter.DWGtoSVGConverter;

@RestController
public class DWGtoSVGController {

    @RequestMapping(value ="/api/v1/files/{id}", method = RequestMethod.POST )
    @ResponseBody
    public SVGfile dwgtoswg(@RequestParam("file") MultipartFile file, method = RequestMethod.POST, consumes = "multipart/form-data" ) {

        DWGtoSVGConverter dwgtosvgconverter;

        File svgfile = dwgtosvgconverter.convert(file);
        return svgfile;
    }
}
