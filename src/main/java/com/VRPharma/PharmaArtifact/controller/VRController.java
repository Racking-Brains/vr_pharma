package com.VRPharma.PharmaArtifact.controller;

import com.VRPharma.PharmaArtifact.models.VRDrug;
import org.springframework.web.bind.annotation.*;

@RestController
public class VRController {
    @PostMapping(path = "/drug/add")
    public VRDrug addDrug(@org.jetbrains.annotations.NotNull @RequestBody VRDrug vrd) {
        
        return new VRDrug(vrd.getDrugid(), vrd.getDrugName(), vrd.getComposition(), vrd.getPrice(), vrd.getQuantity());
    }

    @PostMapping(path = "/drug/edit")
    public VRDrug editDrug(@org.jetbrains.annotations.NotNull @RequestBody VRDrug vrd) {
        return new VRDrug(1, "lkl", "hjhkj", 3, 7);
    }

    @PostMapping(path = "/drug/delete")
    public VRDrug deleteDrug(@org.jetbrains.annotations.NotNull @RequestBody VRDrug vrd) {
        return new VRDrug(1, "lkl", "hjhkj", 3, 7);
    }

    @PostMapping(path = "/drug/list:{id}")
    public VRDrug listDrug(@org.jetbrains.annotations.NotNull @RequestParam String id) {
        return new VRDrug(1, "lkl", "hjhkj", 3, 7);
    }
}