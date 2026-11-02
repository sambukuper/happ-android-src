// Java_libxray_XRayPoint__1_1NewXRayPoint @ 01c6f40c size=40
// callers:
//   Entry Point ?

undefined4
Java_libxray_XRayPoint__1_1NewXRayPoint
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,byte param_4)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 in_x19;
  undefined4 uVar3;
  undefined8 in_x21;
  undefined8 in_x30;
  undefined4 uStack_2c;
  uint uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  undefined8 local_10;
  
  uVar3 = (undefined4)((uint)in_x21 >> 0x20);
  uStack_18 = in_x30;
  local_10 = in_x19;
  uVar1 = go_seq_to_refnum(param_1,param_3);
  uStack_28 = uStack_18;
  local_20 = local_10;
  uStack_18._4_4_ = uVar3;
  uVar2 = _cgo_wait_runtime_init_done();
  uStack_28 = (uint)param_4;
  uStack_2c = uVar1;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__NewXRayPoint,&uStack_2c,0xc,uVar2);
  _cgo_release_context(uVar2);
  return uStack_18._4_4_;
}


