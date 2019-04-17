/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Aluno
 */
public class MeuColetor {
    
    public static void main(String[] args) {
        
        SystemInfo sysInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = sysInfo.getHardware();
        CentralProcessor processador = hardware.getProcessor();
        String nomeProcessador = processador.getName();
        System.out.println(nomeProcessador);
        
    }
}
