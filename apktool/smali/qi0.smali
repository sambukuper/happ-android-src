.class public final Lqi0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Luh0;


# instance fields
.field public final X:Lit2;

.field public final Y:Lit2;

.field public final Z:Lcl7;

.field public final f0:Lyx7;

.field public final g0:Lef0;

.field public final h0:Ljm2;

.field public final i0:Lhm2;

.field public final j0:Lpw;

.field public final k0:Lni0;

.field public final l0:Lri0;

.field public final m0:Lsi0;

.field public final n0:Llt2;

.field public final o0:Lb71;

.field public final p0:Lu51;

.field public final q0:Lpv;


# direct methods
.method public constructor <init>(Lhi0;Ljj0;Lit2;Lit2;Lcl7;Lyx7;Lef0;Ljm2;Lhm2;Lpw;Lni0;Lri0;Lsi0;Llt2;Lb71;Lu51;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    iget-object v3, v1, Lhi0;->d:Ljava/util/ArrayList;

    iget v4, v1, Lhi0;->h:I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v2, Lcl7;->h0:Ljava/util/List;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, p3

    .line 2
    iput-object v6, v0, Lqi0;->X:Lit2;

    move-object/from16 v6, p4

    .line 3
    iput-object v6, v0, Lqi0;->Y:Lit2;

    .line 4
    iput-object v2, v0, Lqi0;->Z:Lcl7;

    move-object/from16 v6, p6

    .line 5
    iput-object v6, v0, Lqi0;->f0:Lyx7;

    move-object/from16 v6, p7

    .line 6
    iput-object v6, v0, Lqi0;->g0:Lef0;

    move-object/from16 v6, p8

    .line 7
    iput-object v6, v0, Lqi0;->h0:Ljm2;

    move-object/from16 v6, p9

    .line 8
    iput-object v6, v0, Lqi0;->i0:Lhm2;

    move-object/from16 v6, p10

    .line 9
    iput-object v6, v0, Lqi0;->j0:Lpw;

    move-object/from16 v6, p11

    .line 10
    iput-object v6, v0, Lqi0;->k0:Lni0;

    move-object/from16 v6, p12

    .line 11
    iput-object v6, v0, Lqi0;->l0:Lri0;

    move-object/from16 v6, p13

    .line 12
    iput-object v6, v0, Lqi0;->m0:Lsi0;

    move-object/from16 v6, p14

    .line 13
    iput-object v6, v0, Lqi0;->n0:Llt2;

    move-object/from16 v6, p15

    .line 14
    iput-object v6, v0, Lqi0;->o0:Lb71;

    move-object/from16 v6, p16

    .line 15
    iput-object v6, v0, Lqi0;->p0:Lu51;

    const/4 v6, 0x0

    .line 16
    invoke-static {v6}, Lnr4;->e(Z)Lpv;

    move-result-object v7

    iput-object v7, v0, Lqi0;->q0:Lpv;

    .line 17
    iget-object v7, v1, Lhi0;->a:Ljava/lang/String;

    .line 18
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v9, p2

    check-cast v9, Llf0;

    invoke-virtual {v9, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    .line 19
    const-string v10, "External"

    const-string v11, "Unknown"

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-nez v14, :cond_1

    const-string v8, "Front"

    goto :goto_3

    :cond_1
    :goto_0
    if-nez v8, :cond_2

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_3

    const-string v8, "Back"

    goto :goto_3

    :cond_3
    :goto_1
    if-nez v8, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v12, :cond_5

    move-object v8, v10

    goto :goto_3

    :cond_5
    :goto_2
    move-object v8, v11

    .line 22
    :goto_3
    sget-object v14, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v14}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    if-nez v14, :cond_6

    goto :goto_4

    .line 23
    :cond_6
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-nez v15, :cond_7

    const-string v10, "Limited"

    goto :goto_9

    :cond_7
    :goto_4
    if-nez v14, :cond_8

    goto :goto_5

    .line 24
    :cond_8
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v13, :cond_9

    const-string v10, "Full"

    goto :goto_9

    :cond_9
    :goto_5
    if-nez v14, :cond_a

    goto :goto_6

    .line 25
    :cond_a
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v12, :cond_b

    const-string v10, "Legacy"

    goto :goto_9

    :cond_b
    :goto_6
    if-nez v14, :cond_c

    goto :goto_7

    .line 26
    :cond_c
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/4 v6, 0x3

    if-ne v15, v6, :cond_d

    const-string v10, "Level 3"

    goto :goto_9

    :cond_d
    :goto_7
    if-nez v14, :cond_e

    goto :goto_8

    .line 27
    :cond_e
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v14, 0x4

    if-ne v6, v14, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    move-object v10, v11

    :goto_9
    if-ne v4, v13, :cond_10

    .line 28
    const-string v11, "High Speed"

    goto :goto_a

    :cond_10
    if-nez v4, :cond_11

    .line 29
    const-string v11, "Normal"

    goto :goto_a

    :cond_11
    if-ne v4, v12, :cond_12

    .line 30
    const-string v11, "Extension"

    .line 31
    :cond_12
    :goto_a
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v6}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    if-eqz v6, :cond_13

    const/16 v9, 0xb

    .line 32
    invoke-static {v6, v9}, Leu;->a0([II)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 33
    const-string v6, "Logical"

    goto :goto_b

    .line 34
    :cond_13
    const-string v6, "Physical"

    .line 35
    :goto_b
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " (Camera "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, ")\n"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string v14, " ("

    const-string v12, ", "

    move/from16 p4, v13

    .line 38
    const-string v13, "  Facing:    "

    invoke-static {v13, v8, v14, v6, v12}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 39
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "  Mode:      "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    const-string v6, "Outputs:\n"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    iget-object v2, v2, Lcl7;->i0:Ljava/util/ArrayList;

    .line 43
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v11, "\n"

    const/16 v12, 0xc

    if-eqz v6, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lfl0;

    .line 44
    iget-object v6, v6, Lfl0;->b:Ljava/util/ArrayList;

    .line 45
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v13, 0x0

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v13, 0x1

    if-ltz v13, :cond_1c

    check-cast v14, Lbl7;

    const/16 p5, 0x0

    .line 46
    const-string v10, "  "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v13, :cond_16

    .line 47
    iget-object v10, v14, Lbl7;->j:Lfl0;

    if-eqz v10, :cond_15

    .line 48
    iget v10, v10, Lfl0;->a:I

    .line 49
    invoke-static {v10}, Ldl7;->a(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_d

    .line 50
    :cond_15
    const-string v0, "stream"

    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    throw p5

    .line 51
    :cond_16
    const-string v10, ""

    .line 52
    :goto_d
    invoke-static {v12, v10}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    iget v10, v14, Lbl7;->a:I

    iget-object v13, v14, Lbl7;->d:Ljava/lang/String;

    .line 54
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v12, "Output-"

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xc

    .line 55
    invoke-static {v10, v8}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    iget-object v8, v14, Lbl7;->b:Landroid/util/Size;

    .line 57
    invoke-virtual {v8}, Landroid/util/Size;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v8}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    iget v8, v14, Lbl7;->c:I

    .line 59
    invoke-static {v8}, Lyk7;->a(I)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0x10

    invoke-static {v10, v8}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    iget-object v8, v14, Lbl7;->e:Lbf5;

    .line 61
    const-string v12, " ["

    if-eqz v8, :cond_17

    .line 62
    iget-byte v8, v8, Lbf5;->a:B

    .line 63
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Lbf5;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5d

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    :cond_17
    iget-object v8, v14, Lbl7;->f:Laf5;

    move-object/from16 p9, v2

    move-object v10, v3

    if-eqz v8, :cond_18

    .line 65
    iget-wide v2, v8, Laf5;->a:J

    .line 66
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Laf5;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_18
    iget-object v2, v14, Lbl7;->g:Lcf5;

    move v8, v4

    if-eqz v2, :cond_19

    .line 68
    iget-wide v3, v2, Lcf5;->a:J

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v5

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 p11, v6

    const-string v6, "StreamUseCase(value="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v3, 0x29

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_19
    move-object/from16 v16, v5

    move-object/from16 p11, v6

    .line 72
    :goto_e
    iget-object v2, v14, Lbl7;->i:Ldf5;

    if-eqz v2, :cond_1a

    .line 73
    iget-wide v2, v2, Ldf5;->a:J

    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StreamUseHint(value="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v3, 0x29

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_1a
    invoke-static {v13, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    .line 78
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    new-instance v2, Lvi0;

    invoke-direct {v2, v13}, Lvi0;-><init>(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    const-string v2, "]"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :cond_1b
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p9

    move-object/from16 v6, p11

    move v4, v8

    move-object v3, v10

    move v13, v15

    move-object/from16 v5, v16

    const/16 v8, 0xa

    const/16 v12, 0xc

    goto/16 :goto_c

    :cond_1c
    const/16 p5, 0x0

    .line 83
    invoke-static {}, Li21;->X()V

    throw p5

    :cond_1d
    move-object v10, v3

    move v8, v4

    move-object/from16 v16, v5

    const/16 p5, 0x0

    .line 84
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1e

    .line 85
    const-string v2, "Inputs:\n"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzk7;

    .line 87
    const-string v4, " "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget v4, v3, Lzk7;->a:I

    .line 89
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Input-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xc

    .line 90
    invoke-static {v5, v4}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    iget v3, v3, Lzk7;->b:I

    .line 92
    invoke-static {v3}, Lyk7;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lfm7;->t0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    .line 95
    :cond_1e
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Session Template: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    iget v3, v1, Lhi0;->f:I

    .line 97
    invoke-static {v3}, Lwe6;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    const-string v2, "Session Parameters"

    .line 99
    iget-object v4, v1, Lhi0;->g:Ljava/util/Map;

    .line 100
    invoke-static {v9, v2, v4}, Lvj8;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Default Template: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p4 .. p4}, Lwe6;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    const-string v2, "Default Parameters"

    .line 103
    iget-object v3, v1, Lhi0;->i:Ljava/util/Map;

    .line 104
    invoke-static {v9, v2, v3}, Lvj8;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    .line 105
    const-string v2, "Required Parameters"

    .line 106
    iget-object v1, v1, Lhi0;->l:Ljava/util/Map;

    .line 107
    invoke-static {v9, v2, v1}, Lvj8;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V

    move/from16 v1, p4

    if-ne v8, v1, :cond_23

    .line 108
    iget-object v1, v0, Lqi0;->Z:Lcl7;

    .line 109
    iget-object v1, v1, Lcl7;->j0:Ljava/util/ArrayList;

    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_22

    .line 111
    iget-object v1, v0, Lqi0;->Z:Lcl7;

    .line 112
    iget-object v1, v1, Lcl7;->j0:Ljava/util/ArrayList;

    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 114
    iget-object v2, v0, Lqi0;->Z:Lcl7;

    const/4 v3, 0x2

    if-gt v1, v3, :cond_21

    .line 115
    iget-object v1, v2, Lcl7;->j0:Ljava/util/ArrayList;

    if-eqz v1, :cond_1f

    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_11

    .line 117
    :cond_1f
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbl7;

    .line 118
    invoke-virtual {v2}, Lbl7;->a()Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_10

    .line 119
    :cond_20
    iget-object v0, v0, Lqi0;->Z:Lcl7;

    .line 120
    iget-object v0, v0, Lcl7;->j0:Ljava/util/ArrayList;

    .line 121
    const-string v1, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are "

    invoke-static {v0, v1}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    throw p5

    .line 122
    :cond_21
    const-string v0, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are "

    .line 123
    iget-object v1, v2, Lcl7;->j0:Ljava/util/ArrayList;

    .line 124
    invoke-static {v1, v0}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    throw p5

    .line 125
    :cond_22
    const-string v0, "Cannot create a HIGH_SPEED CameraGraph without outputs."

    .line 126
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    throw p5

    :cond_23
    :goto_11
    if-eqz v10, :cond_26

    .line 127
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_25

    .line 128
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_26

    .line 129
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_24

    goto :goto_12

    .line 130
    :cond_24
    const-string v0, "Multi resolution reprocessing not supported under Android S"

    .line 131
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    throw p5

    .line 132
    :cond_25
    const-string v0, "At least one InputConfiguration is required for reprocessing"

    .line 133
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    throw p5

    .line 134
    :cond_26
    :goto_12
    iget-object v1, v0, Lqi0;->Z:Lcl7;

    .line 135
    iget-object v1, v1, Lcl7;->g0:Lip4;

    .line 136
    invoke-virtual {v1}, Lip4;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_27

    .line 137
    iget-object v0, v0, Lqi0;->f0:Lyx7;

    invoke-virtual {v0}, Lyx7;->g()V

    :cond_27
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 1
    iget-object v0, p0, Lqi0;->q0:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "#close"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lqi0;->X:Lit2;

    .line 30
    .line 31
    iget-object v0, v0, Lit2;->b:Lht2;

    .line 32
    .line 33
    invoke-virtual {v0}, Lht2;->close()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lqi0;->g0:Lef0;

    .line 37
    .line 38
    iget-object v1, v0, Lef0;->q:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v1

    .line 41
    :try_start_0
    invoke-virtual {v0}, Lef0;->c()Z

    .line 42
    .line 43
    .line 44
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    :cond_0
    :goto_0
    monitor-exit v1

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    :try_start_1
    sget-object v2, Lsh0;->k0:Lsh0;

    .line 52
    .line 53
    iput-object v2, v0, Lef0;->s:Lmb6;

    .line 54
    .line 55
    invoke-virtual {v0}, Lef0;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lef0;->y:Lsy8;

    .line 59
    .line 60
    iget-object v4, v0, Lef0;->z:Lsn0;

    .line 61
    .line 62
    iput-object v3, v0, Lef0;->y:Lsy8;

    .line 63
    .line 64
    iput-object v3, v0, Lef0;->z:Lsn0;

    .line 65
    .line 66
    iget-object v5, v0, Lef0;->w:Log7;

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    invoke-virtual {v5, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    :goto_1
    iget-object v5, v0, Lef0;->B:Log7;

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    invoke-virtual {v5, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    iput-object v3, v0, Lef0;->B:Log7;

    .line 85
    .line 86
    iget-object v5, v0, Lef0;->C:Log7;

    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iput-object v3, v0, Lef0;->C:Log7;

    .line 94
    .line 95
    iget-object v5, v0, Lef0;->D:Log7;

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    invoke-virtual {v5, v3}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    iput-object v3, v0, Lef0;->D:Log7;

    .line 103
    .line 104
    iget-object v5, v0, Lef0;->g:Lnf0;

    .line 105
    .line 106
    invoke-static {v5}, Lp61;->z(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v4, v2}, Lef0;->b(Lsn0;Lsy8;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lef0;->d:Lhi0;

    .line 113
    .line 114
    iget-object v4, v2, Lhi0;->n:Lji0;

    .line 115
    .line 116
    iget-boolean v4, v4, Lji0;->e:Z

    .line 117
    .line 118
    if-nez v4, :cond_6

    .line 119
    .line 120
    iget-object v4, v0, Lef0;->l:Ljg0;

    .line 121
    .line 122
    iget-object v2, v2, Lhi0;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v4, v2}, Ljg0;->a(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_0

    .line 129
    .line 130
    :cond_6
    iget-object v2, v0, Lef0;->d:Lhi0;

    .line 131
    .line 132
    iget-object v2, v2, Lhi0;->a:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v2}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lef0;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    iget-object v2, v0, Lef0;->j:Ls16;

    .line 141
    .line 142
    iget-object v0, v0, Lef0;->d:Lhi0;

    .line 143
    .line 144
    iget-object v0, v0, Lhi0;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v4, Lqe6;

    .line 153
    .line 154
    invoke-direct {v4, v0}, Lqe6;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v5, v4, Lqe6;->b:Lux0;

    .line 158
    .line 159
    iget-object v2, v2, Ls16;->e:Lfu6;

    .line 160
    .line 161
    iget-object v2, v2, Lfu6;->h0:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lx90;

    .line 164
    .line 165
    invoke-interface {v2, v4}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    instance-of v2, v2, Ltp0;

    .line 170
    .line 171
    if-eqz v2, :cond_0

    .line 172
    .line 173
    invoke-static {v0}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    sget-object v0, Ldn8;->a:Ldn8;

    .line 177
    .line 178
    invoke-virtual {v5, v0}, Lrm3;->V(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :goto_2
    iget-object v0, p0, Lqi0;->h0:Ljm2;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljm2;->close()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lqi0;->i0:Lhm2;

    .line 189
    .line 190
    invoke-virtual {v0}, Lhm2;->close()V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lqi0;->f0:Lyx7;

    .line 194
    .line 195
    invoke-virtual {v0}, Lyx7;->close()V

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lqi0;->Z:Lcl7;

    .line 199
    .line 200
    invoke-virtual {v0}, Lcl7;->close()V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lqi0;->j0:Lpw;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object v1, v0, Lpw;->c:Ljava/lang/Object;

    .line 209
    .line 210
    monitor-enter v1

    .line 211
    :try_start_2
    invoke-virtual {v0}, Lpw;->a()Lqw;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iget-object v4, v0, Lpw;->d:Ljava/util/LinkedHashMap;

    .line 216
    .line 217
    invoke-interface {v4, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lpw;->a()Lqw;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-eqz v4, :cond_7

    .line 225
    .line 226
    invoke-virtual {v4, v2}, Lqw;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-nez v2, :cond_7

    .line 231
    .line 232
    iget-object v2, v0, Lpw;->b:Lwl6;

    .line 233
    .line 234
    iget-object v5, v0, Lpw;->a:Lm51;

    .line 235
    .line 236
    new-instance v6, Lk;

    .line 237
    .line 238
    const/4 v7, 0x2

    .line 239
    invoke-direct {v6, v0, v4, v3, v7}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    sget-object v0, Le71;->f0:Le71;

    .line 249
    .line 250
    new-instance v4, Lwu1;

    .line 251
    .line 252
    const/4 v7, 0x4

    .line 253
    invoke-direct {v4, v2, v6, v3, v7}, Lwu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 254
    .line 255
    .line 256
    const/4 v2, 0x1

    .line 257
    invoke-static {v5, v3, v0, v4, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 258
    .line 259
    .line 260
    :cond_7
    monitor-exit v1

    .line 261
    iget-object p0, p0, Lqi0;->o0:Lb71;

    .line 262
    .line 263
    invoke-static {p0, v3}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :catchall_1
    move-exception p0

    .line 271
    monitor-exit v1

    .line 272
    throw p0

    .line 273
    :goto_3
    monitor-exit v1

    .line 274
    throw p0

    .line 275
    :cond_8
    return-void
.end method

.method public final k(Ls51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lpi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lpi0;

    .line 7
    .line 8
    iget v1, v0, Lpi0;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpi0;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpi0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lpi0;-><init>(Lqi0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lpi0;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpi0;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lpi0;->h0:I

    .line 49
    .line 50
    iget-object p1, p0, Lqi0;->n0:Llt2;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Llt2;->a(Ls51;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Lc71;->X:Lc71;

    .line 57
    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    :goto_1
    move-object v1, p1

    .line 62
    check-cast v1, Ls15;

    .line 63
    .line 64
    new-instance v0, Lti0;

    .line 65
    .line 66
    iget-object v5, p0, Lqi0;->l0:Lri0;

    .line 67
    .line 68
    iget-object v6, p0, Lqi0;->m0:Lsi0;

    .line 69
    .line 70
    iget-object v2, p0, Lqi0;->X:Lit2;

    .line 71
    .line 72
    iget-object v3, p0, Lqi0;->p0:Lu51;

    .line 73
    .line 74
    iget-object v4, p0, Lqi0;->i0:Lhm2;

    .line 75
    .line 76
    invoke-direct/range {v0 .. v6}, Lti0;-><init>(Ls15;Lit2;Lu51;Lhm2;Lri0;Lsi0;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final m(ILandroid/view/Surface;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ldl7;->a(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "#setSurface"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/Surface;->isValid()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Lqi0;->f0:Lyx7;

    .line 37
    .line 38
    const-string v0, "Surface ("

    .line 39
    .line 40
    iget-object v1, p0, Lyx7;->f0:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Ldl7;

    .line 47
    .line 48
    invoke-direct {v2, p1}, Ldl7;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_10

    .line 56
    .line 57
    iget-object v1, p0, Lyx7;->g0:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v1

    .line 60
    :try_start_0
    iget-boolean v2, p0, Lyx7;->k0:Z

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    invoke-static {p1}, Ldl7;->a(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_1
    :goto_0
    monitor-exit v1

    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_2
    if-eqz p2, :cond_3

    .line 80
    .line 81
    :try_start_1
    invoke-static {p1}, Ldl7;->a(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-static {p1}, Ldl7;->a(I)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    :goto_1
    iget-object v2, p0, Lyx7;->h0:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    if-nez p2, :cond_4

    .line 94
    .line 95
    :try_start_2
    new-instance p2, Ldl7;

    .line 96
    .line 97
    invoke-direct {p2, p1}, Ldl7;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v2, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Landroid/view/Surface;

    .line 105
    .line 106
    iget-boolean p2, p0, Lyx7;->j0:Z

    .line 107
    .line 108
    if-eqz p2, :cond_6

    .line 109
    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    iget-object p2, p0, Lyx7;->i0:Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    new-instance v3, Ldl7;

    .line 122
    .line 123
    invoke-direct {v3, p1}, Ldl7;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Landroid/view/Surface;

    .line 131
    .line 132
    iget-object v3, p0, Lyx7;->h0:Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    new-instance v4, Ldl7;

    .line 135
    .line 136
    invoke-direct {v4, p1}, Ldl7;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    iget-boolean p1, p0, Lyx7;->j0:Z

    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    invoke-static {v2, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_6

    .line 151
    .line 152
    iget-object p1, p0, Lyx7;->i0:Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_5

    .line 159
    .line 160
    iget-object p1, p0, Lyx7;->i0:Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    invoke-static {p1}, Lci8;->f(Ljava/lang/Object;)Ljava/util/Map;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 171
    .line 172
    iget-object v0, p0, Lyx7;->Z:Ljl0;

    .line 173
    .line 174
    invoke-virtual {v0, p2}, Ljl0;->a(Landroid/view/Surface;)Lil0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v2, p0, Lyx7;->i0:Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string p1, ") is already in use!"

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    :cond_6
    const/4 p1, 0x0

    .line 212
    :goto_2
    monitor-exit v1

    .line 213
    invoke-virtual {p0}, Lyx7;->g()V

    .line 214
    .line 215
    .line 216
    if-eqz p1, :cond_f

    .line 217
    .line 218
    instance-of p0, p1, Ljava/lang/AutoCloseable;

    .line 219
    .line 220
    if-eqz p0, :cond_7

    .line 221
    .line 222
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_7
    instance-of p0, p1, Ljava/util/concurrent/ExecutorService;

    .line 227
    .line 228
    if-eqz p0, :cond_b

    .line 229
    .line 230
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 231
    .line 232
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    if-ne p1, p0, :cond_8

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_8
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-nez p0, :cond_f

    .line 244
    .line 245
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 246
    .line 247
    .line 248
    const/4 p2, 0x0

    .line 249
    :cond_9
    :goto_3
    if-nez p0, :cond_a

    .line 250
    .line 251
    :try_start_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 252
    .line 253
    const-wide/16 v1, 0x1

    .line 254
    .line 255
    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 256
    .line 257
    .line 258
    move-result p0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 259
    goto :goto_3

    .line 260
    :catch_0
    if-nez p2, :cond_9

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    const/4 p2, 0x1

    .line 266
    goto :goto_3

    .line 267
    :cond_a
    if-eqz p2, :cond_f

    .line 268
    .line 269
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_b
    instance-of p0, p1, Landroid/content/res/TypedArray;

    .line 278
    .line 279
    if-eqz p0, :cond_c

    .line 280
    .line 281
    check-cast p1, Landroid/content/res/TypedArray;

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_c
    instance-of p0, p1, Landroid/media/MediaMetadataRetriever;

    .line 288
    .line 289
    if-eqz p0, :cond_d

    .line 290
    .line 291
    check-cast p1, Landroid/media/MediaMetadataRetriever;

    .line 292
    .line 293
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_d
    instance-of p0, p1, Landroid/media/MediaDrm;

    .line 298
    .line 299
    if-eqz p0, :cond_e

    .line 300
    .line 301
    check-cast p1, Landroid/media/MediaDrm;

    .line 302
    .line 303
    invoke-virtual {p1}, Landroid/media/MediaDrm;->release()V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_e
    invoke-static {}, Lkp5;->e()V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :cond_f
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :goto_5
    monitor-exit v1

    .line 316
    throw p0

    .line 317
    :cond_10
    new-instance p2, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v0, "Cannot configure surface for "

    .line 320
    .line 321
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-static {p1}, Ldl7;->a(I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v0, ", it is permanently assigned to "

    .line 332
    .line 333
    iget-object p0, p0, Lyx7;->f0:Ljava/util/Map;

    .line 334
    .line 335
    new-instance v1, Ldl7;

    .line 336
    .line 337
    invoke-direct {v1, p1}, Ldl7;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-static {p2, v0, p0}, Lbt;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lqi0;->k0:Lni0;

    .line 2
    .line 3
    iget-object p0, p0, Lni0;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
