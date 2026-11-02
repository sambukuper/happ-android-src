// proxylibxray_XRayPoint_QueryStatsServer @ 01c6e158 size=140
// callers:
//   Entry Point ?
//   01c6f78c Java_libxray_XRayPoint_queryStatsServer

void proxylibxray_XRayPoint_QueryStatsServer(dword param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 *in_x8;
  undefined4 in_w23;
  undefined8 in_x30;
  uint local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined4 local_30;
  
  uStack_38 = in_x30;
  local_30 = in_w23;
  uVar1 = _cgo_wait_runtime_init_done();
  uStack_50 = 0;
  local_48 = 0;
  uStack_40 = 0;
  local_68 = (uint)param_1;
  uStack_60 = param_2;
  uStack_58 = param_3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_QueryStatsServer,&local_68,0x2c,uVar1);
  _cgo_release_context(uVar1);
  *in_x8 = uStack_40;
  in_x8[1] = uStack_38;
  *(undefined4 *)(in_x8 + 2) = local_30;
  return;
}


