// cproxylibxray_ProcessFinder_FindProcessByConnection @ 01c6fae0 size=260
// callers:
//   Entry Point ?
//   01c6eaf0 _cgo_5994d4b84130_Cfunc_cproxylibxray_ProcessFinder_FindProcessByConnection

undefined8
cproxylibxray_ProcessFinder_FindProcessByConnection
          (uint param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
          undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 in_stack_00000000;
  
  param_1 = param_1 & 0xffffffff;
  piVar1 = (int *)go_seq_push_local_frame(5);
  uVar2 = go_seq_from_refnum(piVar1,param_1 & 0xffffffff,proxy_class_libxray_ProcessFinder,
                             proxy_class_libxray_ProcessFinder_cons);
  uVar3 = go_seq_to_java_string(piVar1,param_2,param_3);
  uVar4 = go_seq_to_java_string(piVar1,param_4,param_5);
  uVar5 = go_seq_to_java_string(piVar1,param_7,param_8);
  uVar2 = (**(code **)(*piVar1 + 0x1a0))
                    (piVar1,uVar2,DAT_02132888,uVar3,uVar4,param_6,uVar5,in_stack_00000000);
  go_seq_pop_local_frame(piVar1);
  return uVar2;
}


