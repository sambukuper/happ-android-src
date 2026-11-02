// proxylibxray_XRayPoint_CoreRunLoopWithTun @ 01c6dec0 size=128
// callers:
//   Entry Point ?
//   01c6f4fc Java_libxray_XRayPoint_coreRunLoopWithTun

undefined4
proxylibxray_XRayPoint_CoreRunLoopWithTun
          (dword param_1,undefined8 param_2,undefined8 param_3,dword param_4)

{
  undefined8 uVar1;
  undefined8 in_x23;
  uint local_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  uint local_40;
  undefined4 uStack_2c;
  
  uStack_2c = (undefined4)((uint)in_x23 >> 0x20);
  uVar1 = _cgo_wait_runtime_init_done();
  local_58 = (uint)param_1;
  local_40 = (uint)param_4;
  uStack_50 = param_2;
  uStack_48 = param_3;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_XRayPoint_CoreRunLoopWithTun,&local_58,0x20,uVar1);
  _cgo_release_context(uVar1);
  return uStack_2c;
}


