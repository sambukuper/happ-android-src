// proxylibxray__LoadGeoFileRuleNames @ 01c6e764 size=120
// callers:
//   Entry Point ?
//   01c6f0d8 Java_libxray_Libxray_loadGeoFileRuleNames

void proxylibxray__LoadGeoFileRuleNames(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 *in_x8;
  undefined4 in_w22;
  undefined8 in_x30;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  undefined8 uStack_28;
  undefined4 local_20;
  
  uStack_28 = in_x30;
  local_20 = in_w22;
  uVar1 = _cgo_wait_runtime_init_done();
  local_40 = 0;
  uStack_38 = 0;
  local_30 = 0;
  local_50 = param_1;
  uStack_48 = param_2;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__LoadGeoFileRuleNames,&local_50,0x24,uVar1);
  _cgo_release_context(uVar1);
  *in_x8 = local_30;
  in_x8[1] = uStack_28;
  *(undefined4 *)(in_x8 + 2) = local_20;
  return;
}


