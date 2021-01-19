package com.VRPharma.PharmaArtifact.controller;

import com.VRPharma.PharmaArtifact.models.VRDrug;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VRController {
    @PostMapping(path = "/drug/add")
    public VRDrug addDrug(@org.jetbrains.annotations.NotNull @RequestBody String vrd) {
        System.out.println(vrd.toString());
        return new VRDrug(1,"lkl", "hjhkj", 3,7);
    }
}