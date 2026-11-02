// Java_libxray_Libxray__1init @ 01c6ec70 size=676
// callers:
//   Entry Point ?

void Java_libxray_Libxray__1init(int *param_1)

{
  undefined8 uVar1;
  char *pcVar2;
  undefined *puVar3;
  
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/ConsoleLogWriter");
  proxy_class_libxray_ConsoleLogWriter = (**(code **)(*param_1 + 0xa8))(param_1,uVar1);
  pcVar2 = "<init>";
  puVar3 = &DAT_00535f7d;
  proxy_class_libxray_ConsoleLogWriter_cons =
       (**(code **)(*param_1 + 0x108))(param_1,uVar1,"<init>",&DAT_00535f7d);
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/XRayPoint");
  proxy_class_libxray_XRayPoint = (**(code **)(*param_1 + 0xa8))(param_1,uVar1);
  proxy_class_libxray_XRayPoint_cons = (**(code **)(*param_1 + 0x108))(param_1,uVar1,pcVar2,puVar3);
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/Libxray$proxyProcessFinder");
  proxy_class_libxray_ProcessFinder = (**(code **)(*param_1 + 0xa8))(param_1,uVar1);
  proxy_class_libxray_ProcessFinder_cons =
       (**(code **)(*param_1 + 0x108))(param_1,uVar1,pcVar2,puVar3);
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/ProcessFinder");
  DAT_02132888 = (**(code **)(*param_1 + 0x108))
                           (param_1,uVar1,"findProcessByConnection",
                            "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)J");
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/Libxray$proxyXRayVPNServiceSupportsSet");
  proxy_class_libxray_XRayVPNServiceSupportsSet = (**(code **)(*param_1 + 0xa8))(param_1,uVar1);
  proxy_class_libxray_XRayVPNServiceSupportsSet_cons =
       (**(code **)(*param_1 + 0x108))(param_1,uVar1,pcVar2,puVar3);
  uVar1 = (**(code **)(*param_1 + 0x30))(param_1,"libxray/XRayVPNServiceSupportsSet");
  DAT_021328a0 = (**(code **)(*param_1 + 0x108))
                           (param_1,uVar1,"onEmitStatus","(JLjava/lang/String;)J");
  puVar3 = &DAT_00535c54;
  DAT_021328a8 = (**(code **)(*param_1 + 0x108))(param_1,uVar1,"shutdown",&DAT_00535c54);
  DAT_021328b0 = (**(code **)(*param_1 + 0x108))(param_1,uVar1,"startup",puVar3);
  return;
}


