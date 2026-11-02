.class public final Lmi0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lwg0;

.field public final b:Llx0;

.field public final c:Ljh0;

.field public final d:Lik0;

.field public final e:Lt79;

.field public final f:Lk28;

.field public final g:Ljj0;

.field public final h:Lbm0;

.field public final i:Ldq;

.field public final j:Lwl6;

.field public final k:Landroid/hardware/camera2/params/DynamicRangeProfiles;


# direct methods
.method public constructor <init>(Lwg0;Llx0;Ljh0;Lik0;Lt79;Lk28;Ljj0;Lbm0;Ldq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lmi0;->a:Lwg0;

    .line 20
    .line 21
    iput-object p2, p0, Lmi0;->b:Llx0;

    .line 22
    .line 23
    iput-object p3, p0, Lmi0;->c:Ljh0;

    .line 24
    .line 25
    iput-object p4, p0, Lmi0;->d:Lik0;

    .line 26
    .line 27
    iput-object p5, p0, Lmi0;->e:Lt79;

    .line 28
    .line 29
    iput-object p6, p0, Lmi0;->f:Lk28;

    .line 30
    .line 31
    iput-object p7, p0, Lmi0;->g:Ljj0;

    .line 32
    .line 33
    iput-object p8, p0, Lmi0;->h:Lbm0;

    .line 34
    .line 35
    iput-object p9, p0, Lmi0;->i:Ldq;

    .line 36
    .line 37
    new-instance p1, Lwl6;

    .line 38
    .line 39
    const/16 p2, 0x13

    .line 40
    .line 41
    invoke-direct {p1, p2}, Lwl6;-><init>(B)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lmi0;->j:Lwl6;

    .line 45
    .line 46
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    const/16 p3, 0x21

    .line 50
    .line 51
    if-lt p1, p3, :cond_1

    .line 52
    .line 53
    if-eqz p7, :cond_1

    .line 54
    .line 55
    invoke-static {p7}, Lc4;->c(Ljj0;)Lvk1;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    if-eqz p4, :cond_1

    .line 60
    .line 61
    if-lt p1, p3, :cond_0

    .line 62
    .line 63
    iget-object p1, p4, Lvk1;->Y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lsx1;

    .line 66
    .line 67
    invoke-interface {p1}, Lsx1;->b()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string p0, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API "

    .line 73
    .line 74
    const-string p3, " (requires API 33)"

    .line 75
    .line 76
    invoke-static {p0, p1, p3}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lkp5;->h(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    throw p2

    .line 84
    :cond_1
    :goto_0
    iput-object p2, p0, Lmi0;->k:Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final a(ILf57;ZLst2;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Lli0;
    .locals 35

    move-object/from16 v0, p0

    move/from16 v8, p1

    move-object/from16 v1, p2

    sget-object v2, Llh4;->n0:Llh4;

    const/4 v3, 0x0

    .line 1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 2
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x2

    if-ne v8, v6, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    move v7, v3

    .line 3
    :goto_0
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move v11, v7

    .line 5
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    new-instance v13, Ljava/util/LinkedHashMap;

    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v12, 0x0

    if-eqz v1, :cond_1a

    .line 7
    iget-object v14, v1, Lf57;->g:Lym0;

    .line 8
    iget-object v15, v0, Lmi0;->i:Ldq;

    if-eqz v15, :cond_1

    .line 9
    iget-object v3, v15, Ldq;->Y:Ljava/lang/Object;

    check-cast v3, Lhj0;

    .line 10
    iget-object v3, v3, Lhj0;->a:Ltv;

    .line 11
    iget-object v5, v1, Lf57;->c:Ljava/util/List;

    .line 12
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    .line 13
    iput-object v5, v3, Ltv;->a:Ljava/lang/Object;

    .line 14
    iget-object v3, v15, Ldq;->Z:Ljava/lang/Object;

    check-cast v3, Ldq;

    .line 15
    iget-object v3, v3, Ldq;->Z:Ljava/lang/Object;

    check-cast v3, Ltv;

    .line 16
    iget-object v5, v1, Lf57;->d:Ljava/util/List;

    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    .line 18
    iput-object v5, v3, Ltv;->a:Ljava/lang/Object;

    .line 19
    :cond_1
    iget v3, v14, Lym0;->c:I

    const/4 v5, -0x1

    if-eq v3, v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    .line 20
    :goto_1
    iget-object v15, v0, Lmi0;->f:Lk28;

    .line 21
    new-instance v5, Lwe6;

    invoke-direct {v5, v3}, Lwe6;-><init>(I)V

    .line 22
    invoke-interface {v15, v5}, Lk28;->e(Lwe6;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 23
    iget-object v5, v14, Lym0;->b:Lqd5;

    .line 24
    invoke-static {v5}, Lw45;->V(Ll11;)Ljava/util/LinkedHashMap;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-ne v8, v6, :cond_3

    .line 25
    sget-object v5, Lsj0;->a:Lxu4;

    .line 26
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v14, p5

    invoke-interface {v7, v5, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_3
    new-instance v5, Lgg0;

    .line 28
    iget-object v5, v1, Lf57;->g:Lym0;

    .line 29
    iget-object v5, v5, Lym0;->b:Lqd5;

    .line 30
    sget-object v14, Lgg0;->p0:Lzx;

    invoke-interface {v5, v14, v12}, Ll11;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 31
    iget-object v14, v1, Lf57;->a:Ljava/util/ArrayList;

    .line 32
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move-object v15, v12

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_18

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v12, v18

    check-cast v12, Lfz;

    .line 33
    iget-object v6, v12, Lfz;->a:Lwg1;

    move-object/from16 v19, v2

    iget v2, v12, Lfz;->d:I

    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v5, :cond_4

    const/16 v20, 0x0

    :goto_3
    move/from16 v21, v3

    goto :goto_4

    :cond_4
    move-object/from16 v20, v5

    goto :goto_3

    .line 35
    :goto_4
    iget-object v3, v12, Lfz;->e:Lpx1;

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p5, v5

    .line 37
    iget v5, v12, Lfz;->c:I

    .line 38
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v22, v11

    const/16 v11, 0x21

    if-lt v8, v11, :cond_7

    .line 39
    new-instance v11, Laf5;

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    const-wide/16 v14, 0x1

    invoke-direct {v11, v14, v15}, Laf5;-><init>(J)V

    .line 40
    iget-object v14, v0, Lmi0;->k:Landroid/hardware/camera2/params/DynamicRangeProfiles;

    if-eqz v14, :cond_6

    .line 41
    invoke-static {v3, v14}, Lqx1;->a(Lpx1;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;

    move-result-object v14

    if-eqz v14, :cond_5

    .line 42
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    .line 43
    new-instance v3, Laf5;

    invoke-direct {v3, v14, v15}, Laf5;-><init>(J)V

    move-object/from16 v29, v3

    goto :goto_5

    .line 44
    :cond_5
    invoke-static {}, Lhi5;->j0()Z

    move-result v14

    if-eqz v14, :cond_6

    .line 45
    invoke-virtual {v3}, Lpx1;->toString()Ljava/lang/String;

    :cond_6
    move-object/from16 v29, v11

    goto :goto_5

    :cond_7
    move-object/from16 v24, v14

    move-object/from16 v25, v15

    const/16 v29, 0x0

    .line 46
    :goto_5
    iget-object v3, v6, Lwg1;->h:Landroid/util/Size;

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    iget v11, v6, Lwg1;->i:I

    if-nez v20, :cond_8

    const/16 v34, 0x0

    goto :goto_6

    .line 49
    :cond_8
    invoke-static/range {v20 .. v20}, Lvi0;->a(Ljava/lang/String;)V

    move-object/from16 v34, v20

    :goto_6
    if-eqz v5, :cond_a

    const/4 v14, 0x1

    if-eq v5, v14, :cond_9

    const/16 v30, 0x0

    goto :goto_8

    .line 50
    :cond_9
    new-instance v5, Lbf5;

    const/4 v15, 0x2

    invoke-direct {v5, v15}, Lbf5;-><init>(I)V

    :goto_7
    move-object/from16 v30, v5

    goto :goto_8

    :cond_a
    const/4 v14, 0x1

    .line 51
    new-instance v5, Lbf5;

    invoke-direct {v5, v14}, Lbf5;-><init>(I)V

    goto :goto_7

    :goto_8
    if-eqz p3, :cond_d

    .line 52
    iget-object v5, v12, Lfz;->a:Lwg1;

    .line 53
    iget-object v5, v5, Lwg1;->j:Ljava/lang/Class;

    .line 54
    const-class v14, Landroid/media/MediaCodec;

    invoke-static {v5, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 55
    sget-object v5, Llh4;->r0:Llh4;

    :goto_9
    move-object/from16 v28, v5

    goto :goto_a

    .line 56
    :cond_b
    const-class v14, Landroid/view/SurfaceHolder;

    invoke-static {v5, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 57
    sget-object v5, Llh4;->o0:Llh4;

    goto :goto_9

    .line 58
    :cond_c
    const-class v14, Landroid/graphics/SurfaceTexture;

    invoke-static {v5, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 59
    sget-object v5, Llh4;->p0:Llh4;

    goto :goto_9

    :cond_d
    move-object/from16 v28, v19

    :goto_a
    if-nez v22, :cond_11

    .line 60
    iget-object v5, v0, Lmi0;->g:Ljj0;

    move-object/from16 v14, p6

    .line 61
    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Long;

    if-eqz v15, :cond_e

    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    move-object/from16 v33, v3

    .line 62
    new-instance v3, Lcf5;

    invoke-direct {v3, v14, v15}, Lcf5;-><init>(J)V

    :goto_b
    const/16 v14, 0x21

    goto :goto_c

    :cond_e
    move-object/from16 v33, v3

    const/4 v3, 0x0

    goto :goto_b

    :goto_c
    if-lt v8, v14, :cond_f

    if-eqz v3, :cond_f

    if-eqz v5, :cond_f

    .line 63
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_STREAM_USE_CASES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v5, Llf0;

    invoke-virtual {v5, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [J

    if-eqz v5, :cond_f

    .line 64
    iget-wide v14, v3, Lcf5;->a:J

    .line 65
    invoke-static {v5, v14, v15}, Leu;->b0([JJ)Z

    move-result v5

    const/4 v14, 0x1

    if-ne v5, v14, :cond_f

    goto :goto_d

    .line 66
    :cond_f
    invoke-static {}, Lhi5;->m0()Z

    move-result v5

    if-eqz v5, :cond_10

    .line 67
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_10
    const/4 v3, 0x0

    :goto_d
    move-object/from16 v31, v3

    goto :goto_e

    :cond_11
    move-object/from16 v33, v3

    const/16 v31, 0x0

    :goto_e
    if-nez v22, :cond_13

    move-object/from16 v3, p7

    .line 68
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    .line 69
    new-instance v5, Ldf5;

    invoke-direct {v5, v14, v15}, Ldf5;-><init>(J)V

    goto :goto_f

    :cond_12
    const/4 v5, 0x0

    :goto_f
    move-object/from16 v32, v5

    goto :goto_10

    :cond_13
    move-object/from16 v3, p7

    const/16 v32, 0x0

    :goto_10
    const/16 v27, 0x220

    move/from16 v26, v11

    .line 70
    invoke-static/range {v26 .. v34}, Lwe5;->h(IILlh4;Laf5;Lbf5;Lcf5;Ldf5;Landroid/util/Size;Ljava/lang/String;)Lze5;

    move-result-object v5

    .line 71
    iget-object v8, v12, Lfz;->b:Ljava/util/List;

    .line 72
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v6}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v8

    .line 73
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object/from16 v15, v25

    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwg1;

    .line 74
    new-instance v12, Lel0;

    invoke-static {v5}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-direct {v12, v14}, Lel0;-><init>(Ljava/util/List;)V

    .line 75
    invoke-interface {v13, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v14, -0x1

    if-eq v2, v14, :cond_15

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v9, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-nez v14, :cond_14

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v12}, [Lel0;

    move-result-object v20

    move/from16 v23, v2

    invoke-static/range {v20 .. v20}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v9, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_14
    move/from16 v23, v2

    .line 78
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_15
    move/from16 v23, v2

    .line 79
    :goto_12
    invoke-static {v11, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 80
    iget-object v2, v0, Lmi0;->e:Lt79;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v11, v1}, Lt79;->e(Lwg1;Lf57;)Z

    move-result v2

    if-eqz v2, :cond_16

    move-object v15, v12

    :cond_16
    move/from16 v2, v23

    goto :goto_11

    :cond_17
    move/from16 v8, p1

    move-object/from16 v5, p5

    move-object/from16 v2, v19

    move/from16 v3, v21

    move/from16 v11, v22

    move-object/from16 v14, v24

    const/4 v6, 0x2

    const/4 v12, 0x0

    goto/16 :goto_2

    :cond_18
    move/from16 v21, v3

    move/from16 v22, v11

    move-object/from16 v25, v15

    .line 81
    iget-object v2, v1, Lf57;->i:Landroid/hardware/camera2/params/InputConfiguration;

    if-eqz v2, :cond_19

    if-eqz v25, :cond_19

    .line 82
    new-instance v2, Lbe3;

    move-object/from16 v12, v25

    .line 83
    iget-object v3, v12, Lel0;->a:Ljava/util/List;

    .line 84
    invoke-static {v3}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lze5;

    .line 85
    iget v3, v3, Lze5;->b:I

    .line 86
    invoke-direct {v2, v12, v3}, Lbe3;-><init>(Lel0;I)V

    .line 87
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    move/from16 v6, v21

    goto :goto_13

    :cond_1a
    move/from16 v22, v11

    const/4 v6, 0x1

    .line 88
    :goto_13
    iget-object v2, v0, Lmi0;->d:Lik0;

    .line 89
    invoke-virtual {v2}, Lik0;->a()Li26;

    move-result-object v3

    const-class v5, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    invoke-virtual {v3, v5}, Li26;->a(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 90
    const-string v3, "CXCP"

    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 91
    :cond_1b
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "cph"

    const/4 v8, 0x0

    .line 92
    invoke-static {v3, v8, v5}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v26

    .line 93
    iget-object v3, v0, Lmi0;->j:Lwl6;

    .line 94
    iget-object v3, v3, Lwl6;->Y:Ljava/lang/Object;

    check-cast v3, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    if-eqz v3, :cond_1e

    .line 95
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->c:Z

    if-nez v3, :cond_1d

    .line 96
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->e:Z

    if-eqz v3, :cond_1c

    .line 97
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->a:Z

    if-nez v3, :cond_1c

    .line 98
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->b:Z

    if-nez v3, :cond_1c

    goto :goto_14

    :cond_1c
    const/16 v27, 0x1

    goto :goto_15

    :cond_1d
    :goto_14
    move/from16 v27, v22

    goto :goto_15

    :cond_1e
    const/16 v27, 0x0

    :goto_15
    if-eqz v22, :cond_20

    .line 99
    const-class v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 100
    invoke-static {}, Lum1;->a()Li26;

    move-result-object v5

    invoke-virtual {v5, v3}, Li26;->b(Ljava/lang/Class;)Lf26;

    move-result-object v3

    if-eqz v3, :cond_20

    :cond_1f
    :goto_16
    const/16 v24, 0x0

    goto :goto_17

    .line 101
    :cond_20
    const-class v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 102
    invoke-static {}, Lum1;->a()Li26;

    move-result-object v5

    invoke-virtual {v5, v3}, Li26;->b(Ljava/lang/Class;)Lf26;

    move-result-object v3

    if-eqz v3, :cond_21

    goto :goto_16

    .line 103
    :cond_21
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-lt v3, v5, :cond_1f

    const/16 v24, 0x1

    .line 104
    :goto_17
    invoke-virtual {v2}, Lik0;->a()Li26;

    move-result-object v2

    .line 105
    const-class v3, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 106
    invoke-virtual {v2, v3}, Li26;->a(Ljava/lang/Class;)Z

    move-result v2

    .line 107
    new-instance v3, Lr75;

    .line 108
    sget-object v5, Lki0;->X:Lki0;

    .line 109
    invoke-direct {v3, v2, v5}, Lr75;-><init>(ILki0;)V

    .line 110
    new-instance v23, Lji0;

    const/16 v28, 0x9

    move-object/from16 v25, v3

    invoke-direct/range {v23 .. v28}, Lji0;-><init>(ZLr75;IZI)V

    if-eqz v1, :cond_24

    .line 111
    iget-object v2, v1, Lf57;->g:Lym0;

    .line 112
    iget-object v3, v2, Lym0;->b:Lqd5;

    sget-object v5, Ler8;->a0:Lzx;

    invoke-virtual {v3, v5, v4}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 113
    iget-object v2, v2, Lym0;->b:Lqd5;

    sget-object v5, Ler8;->b0:Lzx;

    .line 114
    invoke-virtual {v2, v5, v4}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 115
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v14, 0x1

    if-eq v3, v14, :cond_25

    if-ne v2, v14, :cond_22

    goto :goto_18

    :cond_22
    const/4 v15, 0x2

    if-ne v3, v15, :cond_23

    .line 116
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_18

    :cond_23
    if-ne v2, v15, :cond_24

    .line 117
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_18

    :cond_24
    const/4 v4, 0x0

    :cond_25
    :goto_18
    if-eqz v1, :cond_26

    .line 118
    iget-object v2, v1, Lf57;->g:Lym0;

    invoke-virtual {v2}, Lym0;->a()Landroid/util/Range;

    move-result-object v2

    goto :goto_19

    :cond_26
    const/4 v2, 0x0

    .line 119
    :goto_19
    sget-object v3, Liz;->h:Landroid/util/Range;

    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    goto :goto_1a

    :cond_27
    const/4 v2, 0x0

    .line 120
    :goto_1a
    new-instance v3, Lip4;

    invoke-direct {v3}, Lip4;-><init>()V

    if-eqz v22, :cond_28

    .line 121
    sget-object v5, Lsj0;->c:Lxu4;

    .line 122
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5, v8}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    if-eqz v4, :cond_29

    .line 123
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 124
    sget-object v8, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v8, v5}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    :cond_29
    sget-object v5, Lsj0;->b:Lxu4;

    .line 126
    const-string v8, "android.hardware.camera2.CaptureRequest.setTag.CX"

    invoke-virtual {v3, v5, v8}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_2a

    .line 127
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v3, v5, v2}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    :cond_2a
    invoke-virtual {v3}, Lip4;->b()Lip4;

    move-result-object v3

    if-eqz v2, :cond_2b

    .line 129
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-interface {v7, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    if-eqz v4, :cond_2c

    .line 130
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 131
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    if-eqz v1, :cond_31

    .line 132
    new-instance v2, Lgg0;

    .line 133
    iget-object v2, v1, Lf57;->g:Lym0;

    .line 134
    iget-object v2, v2, Lym0;->b:Lqd5;

    .line 135
    sget-object v4, Lgg0;->p0:Lzx;

    const/4 v5, 0x0

    invoke-interface {v2, v4, v5}, Ll11;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    .line 136
    iget-object v1, v1, Lf57;->b:Lfz;

    if-eqz v1, :cond_31

    .line 137
    iget-object v2, v1, Lfz;->a:Lwg1;

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v5, :cond_2d

    const/4 v5, 0x0

    .line 139
    :cond_2d
    iget v1, v1, Lfz;->c:I

    .line 140
    iget-object v4, v2, Lwg1;->h:Landroid/util/Size;

    .line 141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    iget v8, v2, Lwg1;->i:I

    if-nez v5, :cond_2e

    const/16 v32, 0x0

    goto :goto_1b

    .line 143
    :cond_2e
    invoke-static {v5}, Lvi0;->a(Ljava/lang/String;)V

    move-object/from16 v32, v5

    :goto_1b
    if-eqz v1, :cond_30

    const/4 v14, 0x1

    if-eq v1, v14, :cond_2f

    const/16 v28, 0x0

    goto :goto_1d

    .line 144
    :cond_2f
    new-instance v5, Lbf5;

    const/4 v15, 0x2

    invoke-direct {v5, v15}, Lbf5;-><init>(I)V

    :goto_1c
    move-object/from16 v28, v5

    goto :goto_1d

    :cond_30
    const/4 v14, 0x1

    .line 145
    new-instance v5, Lbf5;

    invoke-direct {v5, v14}, Lbf5;-><init>(I)V

    goto :goto_1c

    :goto_1d
    const/16 v30, 0x0

    const/16 v25, 0x3e8

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v31, v4

    move/from16 v24, v8

    .line 146
    invoke-static/range {v24 .. v32}, Lwe5;->h(IILlh4;Laf5;Lbf5;Lcf5;Ldf5;Landroid/util/Size;Ljava/lang/String;)Lze5;

    move-result-object v1

    .line 147
    new-instance v5, Lel0;

    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v5, v1}, Lel0;-><init>(Ljava/util/List;)V

    .line 148
    invoke-interface {v13, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1e

    :cond_31
    const/4 v5, 0x0

    .line 149
    :goto_1e
    iget-object v1, v0, Lmi0;->h:Lbm0;

    if-eqz v1, :cond_33

    .line 150
    sget-object v2, Lpf0;->a:Lzx;

    .line 151
    iget-object v1, v1, Lbm0;->X:Lqd5;

    .line 152
    sget-object v2, Lpf0;->a:Lzx;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_32

    goto :goto_1f

    :cond_32
    invoke-static {}, Lio/sentry/c2;->m()V

    return-object v4

    :cond_33
    const/4 v4, 0x0

    .line 153
    :goto_1f
    iget-object v1, v0, Lmi0;->c:Ljh0;

    .line 154
    iget-object v1, v1, Ljh0;->Y:Ljava/lang/String;

    .line 155
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 156
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    .line 157
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_34

    goto :goto_20

    :cond_34
    move-object v4, v10

    .line 158
    :goto_20
    iget-object v9, v0, Lmi0;->a:Lwg0;

    iget-object v0, v0, Lmi0;->b:Llx0;

    const/4 v15, 0x2

    new-array v10, v15, [Lme6;

    const/16 v16, 0x0

    aput-object v9, v10, v16

    const/16 v17, 0x1

    aput-object v0, v10, v17

    invoke-static {v10}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 159
    invoke-static/range {p4 .. p4}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 160
    new-instance v0, Lhi0;

    move-object v9, v3

    move-object v3, v8

    move-object/from16 v12, v23

    move/from16 v8, p1

    invoke-direct/range {v0 .. v12}, Lhi0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Lel0;ILjava/util/LinkedHashMap;ILip4;Ljava/util/List;Ljava/util/List;Lji0;)V

    .line 161
    new-instance v1, Lli0;

    .line 162
    invoke-static {v13}, Lzp4;->Q(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 163
    invoke-direct {v1, v0, v2}, Lli0;-><init>(Lhi0;Ljava/util/Map;)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CameraGraphConfigProvider<"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lmi0;->c:Ljh0;

    .line 9
    .line 10
    iget-object p0, p0, Ljh0;->Y:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p0}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x3e

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
