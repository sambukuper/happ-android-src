.class public final synthetic Llv5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lpv3;

.field public final synthetic Z:Lon2;

.field public final synthetic f0:Llh7;

.field public final synthetic g0:Lxw8;

.field public final synthetic h0:Lon2;


# direct methods
.method public synthetic constructor <init>(Lkr7;Ltn2;Lrn2;Lpv3;Ly05;)V
    .locals 1

    .line 19
    const/4 v0, 0x2

    iput-byte v0, p0, Llv5;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv5;->g0:Lxw8;

    iput-object p2, p0, Llv5;->Z:Lon2;

    iput-object p3, p0, Llv5;->h0:Lon2;

    iput-object p4, p0, Llv5;->Y:Lpv3;

    iput-object p5, p0, Llv5;->f0:Llh7;

    return-void
.end method

.method public synthetic constructor <init>(Lsq6;Lgn2;Lpv3;Ldn2;Ly05;)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput-byte v0, p0, Llv5;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv5;->g0:Lxw8;

    iput-object p2, p0, Llv5;->h0:Lon2;

    iput-object p3, p0, Llv5;->Y:Lpv3;

    iput-object p4, p0, Llv5;->Z:Lon2;

    iput-object p5, p0, Llv5;->f0:Llh7;

    return-void
.end method

.method public synthetic constructor <init>(Lvv5;Ldn2;Lpv3;Ldn2;Ly05;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Llv5;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llv5;->g0:Lxw8;

    .line 8
    .line 9
    iput-object p2, p0, Llv5;->Z:Lon2;

    .line 10
    .line 11
    iput-object p3, p0, Llv5;->Y:Lpv3;

    .line 12
    .line 13
    iput-object p4, p0, Llv5;->h0:Lon2;

    .line 14
    .line 15
    iput-object p5, p0, Llv5;->f0:Llh7;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v0, p0

    iget-byte v1, v0, Llv5;->X:B

    sget-object v2, Lht;->a:Lct;

    sget-object v6, Ldn8;->a:Ldn8;

    sget-object v9, Lhx4;->X:Lhx4;

    sget-object v14, Lzz0;->a:Lbe;

    iget-object v15, v0, Llv5;->f0:Llh7;

    iget-object v3, v0, Llv5;->Y:Lpv3;

    iget-object v12, v0, Llv5;->h0:Lon2;

    iget-object v4, v0, Llv5;->Z:Lon2;

    iget-object v0, v0, Llv5;->g0:Lxw8;

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lkr7;

    check-cast v4, Ltn2;

    check-cast v12, Lrn2;

    move-object/from16 v1, p1

    check-cast v1, Luw0;

    move-object/from16 v2, p2

    check-cast v2, Ldn2;

    const/16 v31, 0x30

    move-object/from16 v10, p3

    check-cast v10, Llp2;

    move-object/from16 v16, p4

    check-cast v16, Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v1, v16, 0x30

    const/16 v5, 0x20

    if-nez v1, :cond_1

    invoke-virtual {v10, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v16, v16, v1

    :cond_1
    move/from16 v1, v16

    and-int/lit16 v11, v1, 0x91

    const/16 v7, 0x90

    if-eq v11, v7, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    and-int/lit8 v11, v1, 0x1

    invoke-virtual {v10, v11, v7}, Llp2;->N(IZ)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 2
    iget-object v0, v0, Lkr7;->i:Lf76;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sget-object v7, Lyc4;->a:Lz01;

    .line 5
    invoke-virtual {v10, v7}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v7

    .line 6
    instance-of v11, v7, Lsu/happ/proxyutility/ui/BaseActivity;

    if-eqz v11, :cond_3

    check-cast v7, Lsu/happ/proxyutility/ui/BaseActivity;

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 7
    :goto_2
    sget-object v11, Lpc;->b:Lox1;

    .line 8
    invoke-virtual {v10, v11}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v11

    .line 9
    check-cast v11, Landroid/content/Context;

    .line 10
    sget-object v8, Lly2;->a:Lox1;

    .line 11
    invoke-virtual {v10, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v8

    .line 12
    check-cast v8, Lky2;

    .line 13
    filled-new-array {v0, v7, v11, v8}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v10, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v16

    and-int/lit8 v17, v1, 0x70

    xor-int/lit8 v13, v17, 0x30

    if-le v13, v5, :cond_4

    invoke-virtual {v10, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v5, :cond_6

    :cond_5
    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    or-int v1, v16, v1

    invoke-virtual {v10, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v10, v8}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v10, v11}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v10, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    .line 14
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_7

    if-ne v5, v14, :cond_8

    .line 15
    :cond_7
    new-instance v19, Lqi;

    const/16 v26, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    invoke-direct/range {v19 .. v26}, Lqi;-><init>(Lr77;Ldn2;Ltn2;Lky2;Landroid/content/Context;Lrn2;Lq51;)V

    move-object/from16 v5, v19

    .line 16
    invoke-virtual {v10, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 17
    :cond_8
    check-cast v5, Lrn2;

    invoke-static {v7, v5, v10}, Lu70;->k([Ljava/lang/Object;Lrn2;Llp2;)V

    .line 18
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    const/high16 v1, 0x41800000    # 16.0f

    const/4 v2, 0x0

    const/4 v4, 0x2

    .line 19
    invoke-static {v0, v1, v2, v4}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v5

    .line 20
    invoke-static {v10}, Ldh3;->G(Llp2;)Lay6;

    move-result-object v1

    invoke-static {v0, v1}, Ldh3;->V(Lkx4;Lay6;)Lkx4;

    move-result-object v1

    .line 21
    sget-object v2, Lht;->c:Ldt;

    .line 22
    sget-object v4, Lpz2;->q0:Ln50;

    const/4 v7, 0x0

    .line 23
    invoke-static {v2, v4, v10, v7}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    move-result-object v2

    .line 24
    iget-wide v7, v10, Llp2;->T:J

    .line 25
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    .line 26
    invoke-virtual {v10}, Llp2;->l()Lkl5;

    move-result-object v7

    .line 27
    invoke-static {v10, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v1

    .line 28
    sget-object v8, Luz0;->j:Lpz2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-virtual {v10}, Llp2;->Z()V

    .line 30
    iget-boolean v8, v10, Llp2;->S:Z

    if-eqz v8, :cond_9

    .line 31
    invoke-virtual {v10}, Llp2;->k()V

    goto :goto_4

    .line 32
    :cond_9
    invoke-virtual {v10}, Llp2;->j0()V

    .line 33
    :goto_4
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 34
    invoke-static {v8, v10, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 35
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 36
    invoke-static {v2, v10, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 38
    sget-object v7, Lpz2;->C0:Ldx0;

    .line 39
    invoke-static {v7, v10, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 40
    invoke-static {v10}, Lpn7;->l(Llp2;)V

    .line 41
    sget-object v4, Lpz2;->z0:Ldx0;

    .line 42
    invoke-static {v4, v10, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 43
    sget-object v1, Lpz2;->o0:Lo50;

    .line 44
    new-instance v11, Lft;

    new-instance v12, Lbt;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    const/high16 v13, 0x41800000    # 16.0f

    .line 45
    invoke-direct {v11, v13, v12}, Lft;-><init>(FLbt;)V

    const/16 v12, 0x36

    .line 46
    invoke-static {v11, v1, v10, v12}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    move-result-object v1

    .line 47
    iget-wide v11, v10, Llp2;->T:J

    .line 48
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    .line 49
    invoke-virtual {v10}, Llp2;->l()Lkl5;

    move-result-object v12

    .line 50
    invoke-static {v10, v5}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v13

    .line 51
    invoke-virtual {v10}, Llp2;->Z()V

    move-object/from16 v39, v6

    .line 52
    iget-boolean v6, v10, Llp2;->S:Z

    if-eqz v6, :cond_a

    .line 53
    invoke-virtual {v10}, Llp2;->k()V

    goto :goto_5

    .line 54
    :cond_a
    invoke-virtual {v10}, Llp2;->j0()V

    .line 55
    :goto_5
    invoke-static {v8, v10, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 56
    invoke-static {v2, v10, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 57
    invoke-static {v11, v10, v7, v10}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 58
    invoke-static {v4, v10, v13}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 59
    new-instance v1, Ld44;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v11, 0x1

    invoke-direct {v1, v6, v11}, Ld44;-><init>(FZ)V

    .line 60
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lsq7;

    .line 61
    iget-object v6, v6, Lsq7;->X:Ljava/lang/String;

    if-nez v6, :cond_b

    .line 62
    sget v6, Ly46;->dialog_subscription_add_title:I

    goto :goto_6

    .line 63
    :cond_b
    sget v6, Ly46;->dialog_subscription_edit_title:I

    .line 64
    :goto_6
    invoke-static {v6, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v19

    .line 65
    sget-object v6, Les;->a:Lox1;

    .line 66
    invoke-virtual {v10, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v11

    .line 67
    check-cast v11, Lds;

    .line 68
    iget-object v11, v11, Lds;->a:Lcs;

    .line 69
    iget-object v11, v11, Lcs;->c:Lo88;

    .line 70
    sget-object v12, Lep;->z:Lox1;

    .line 71
    invoke-virtual {v10, v12}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v12

    .line 72
    check-cast v12, Ldp;

    .line 73
    iget-object v12, v12, Ldp;->c:Lxr;

    .line 74
    iget-wide v12, v12, Lxr;->a:J

    const/16 v51, 0x0

    const v52, 0xfffffe

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    move-object/from16 v40, v11

    move-wide/from16 v41, v12

    .line 75
    invoke-static/range {v40 .. v52}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v21

    const/high16 v29, 0x30000

    const/16 v30, 0x1d8

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v20, v1

    move-object/from16 v28, v10

    .line 76
    invoke-static/range {v19 .. v30}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    move-object/from16 v1, v28

    const/4 v11, 0x1

    .line 77
    invoke-virtual {v1, v11}, Llp2;->p(Z)V

    const/high16 v10, 0x41a00000    # 20.0f

    .line 78
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v10

    invoke-static {v1, v10}, Lch3;->f(Llp2;Lkx4;)V

    .line 79
    sget v10, Ly46;->dialog_subscription_edit_options:I

    invoke-static {v10, v1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v10

    move/from16 v11, v31

    .line 80
    invoke-static {v10, v5, v1, v11}, Loc;->b(Ljava/lang/String;Lkx4;Llp2;I)V

    const/high16 v10, 0x40800000    # 4.0f

    .line 81
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v11

    invoke-static {v1, v11}, Lch3;->f(Llp2;Lkx4;)V

    .line 82
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lsq7;

    .line 83
    move-object v12, v3

    check-cast v12, Lgn2;

    const/16 v13, 0x180

    .line 84
    invoke-static {v11, v12, v0, v1, v13}, Lrq7;->d(Lsq7;Lgn2;Lkx4;Llp2;I)V

    const/4 v11, 0x6

    const/4 v13, 0x0

    .line 85
    invoke-static {v0, v1, v11, v13}, Lz39;->c(Lkx4;Llp2;II)V

    const/high16 v13, 0x41800000    # 16.0f

    .line 86
    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v11

    invoke-static {v1, v11}, Lch3;->f(Llp2;Lkx4;)V

    .line 87
    sget v11, Ly46;->dialog_subscription_edit_title_and_url:I

    invoke-static {v11, v1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v11

    const/16 v13, 0x30

    .line 88
    invoke-static {v11, v5, v1, v13}, Loc;->b(Ljava/lang/String;Lkx4;Llp2;I)V

    .line 89
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v5

    invoke-static {v1, v5}, Lch3;->f(Llp2;Lkx4;)V

    .line 90
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsq7;

    const/16 v10, 0x180

    .line 91
    invoke-static {v5, v12, v0, v1, v10}, Lrq7;->c(Lsq7;Lgn2;Lkx4;Llp2;I)V

    const/high16 v5, 0x41c00000    # 24.0f

    .line 92
    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v5

    invoke-static {v1, v5}, Lch3;->f(Llp2;Lkx4;)V

    const/4 v5, 0x0

    const/4 v10, 0x2

    const/high16 v13, 0x41800000    # 16.0f

    .line 93
    invoke-static {v0, v13, v5, v10}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v5

    .line 94
    sget-object v10, Lpz2;->Z:Lp50;

    const/4 v13, 0x0

    .line 95
    invoke-static {v10, v13}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v10

    .line 96
    iget-wide v11, v1, Llp2;->T:J

    .line 97
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    .line 98
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    move-result-object v12

    .line 99
    invoke-static {v1, v5}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v5

    .line 100
    invoke-virtual {v1}, Llp2;->Z()V

    .line 101
    iget-boolean v13, v1, Llp2;->S:Z

    if-eqz v13, :cond_c

    .line 102
    invoke-virtual {v1}, Llp2;->k()V

    goto :goto_7

    .line 103
    :cond_c
    invoke-virtual {v1}, Llp2;->j0()V

    .line 104
    :goto_7
    invoke-static {v8, v1, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 105
    invoke-static {v2, v1, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 106
    invoke-static {v11, v1, v7, v1}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 107
    invoke-static {v4, v1, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 108
    sget v2, Ly46;->dialog_subscription_edit_button_positive:I

    invoke-static {v2, v1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v19

    .line 109
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsq7;

    .line 110
    iget-boolean v2, v2, Lsq7;->p0:Z

    .line 111
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsq7;

    .line 112
    iget-boolean v4, v4, Lsq7;->n0:Z

    .line 113
    invoke-virtual {v1, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v5

    .line 114
    check-cast v5, Lds;

    .line 115
    iget-object v5, v5, Lds;->a:Lcs;

    .line 116
    iget-object v5, v5, Lcs;->d:Lo88;

    .line 117
    sget-object v25, Ldj2;->f0:Ldj2;

    const/16 v31, 0x0

    const v32, 0xfffffb

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    move-object/from16 v20, v5

    .line 118
    invoke-static/range {v20 .. v32}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v23

    .line 119
    new-instance v5, Lig5;

    const/high16 v6, 0x41400000    # 12.0f

    .line 120
    invoke-direct {v5, v6, v6, v6, v6}, Lig5;-><init>(FFFF)V

    .line 121
    invoke-virtual {v1, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 122
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_d

    if-ne v7, v14, :cond_e

    .line 123
    :cond_d
    new-instance v7, Laa3;

    const/16 v6, 0xe

    invoke-direct {v7, v3, v6}, Laa3;-><init>(Lpv3;B)V

    .line 124
    invoke-virtual {v1, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 125
    :cond_e
    move-object/from16 v35, v7

    check-cast v35, Ldn2;

    const/16 v37, 0x30

    const v38, 0x7fbe0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v20, v0

    move-object/from16 v36, v1

    move/from16 v21, v2

    move/from16 v22, v4

    move-object/from16 v29, v5

    .line 126
    invoke-static/range {v19 .. v38}, Lkm4;->e(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;Llp2;II)V

    const/4 v11, 0x1

    .line 127
    invoke-virtual {v1, v11}, Llp2;->p(Z)V

    const/high16 v0, 0x41f00000    # 30.0f

    .line 128
    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v0

    invoke-static {v1, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 129
    invoke-virtual {v1, v11}, Llp2;->p(Z)V

    goto :goto_8

    :cond_f
    move-object/from16 v39, v6

    move-object v1, v10

    .line 130
    invoke-virtual {v1}, Llp2;->Q()V

    :goto_8
    return-object v39

    :pswitch_0
    move-object/from16 v39, v6

    const/4 v13, 0x0

    .line 131
    check-cast v0, Lsq6;

    check-cast v12, Lgn2;

    check-cast v4, Ldn2;

    move-object/from16 v1, p1

    check-cast v1, Luw0;

    move-object/from16 v5, p2

    check-cast v5, Ldn2;

    move-object/from16 v6, p3

    check-cast v6, Llp2;

    move-object/from16 v7, p4

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit16 v1, v7, 0x81

    const/16 v5, 0x80

    if-eq v1, v5, :cond_10

    const/4 v11, 0x1

    :goto_9
    const/4 v1, 0x1

    goto :goto_a

    :cond_10
    move v11, v13

    goto :goto_9

    :goto_a
    and-int/lit8 v5, v7, 0x1

    invoke-virtual {v6, v5, v11}, Llp2;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 133
    iget-object v0, v0, Lsq6;->e:Lf76;

    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    invoke-virtual {v6, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    .line 136
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_11

    if-ne v5, v14, :cond_12

    .line 137
    :cond_11
    new-instance v5, Ljy2;

    const/16 v1, 0x1a

    const/4 v7, 0x0

    invoke-direct {v5, v0, v12, v7, v1}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 138
    invoke-virtual {v6, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 139
    :cond_12
    check-cast v5, Lrn2;

    invoke-static {v5, v6, v0}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 140
    sget-object v0, Lpz2;->o0:Lo50;

    .line 141
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    const/high16 v5, 0x41000000    # 8.0f

    const/high16 v13, 0x41800000    # 16.0f

    .line 142
    invoke-static {v1, v13, v5}, Los4;->y(Lkx4;FF)Lkx4;

    move-result-object v5

    const/16 v11, 0x30

    .line 143
    invoke-static {v2, v0, v6, v11}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    move-result-object v0

    .line 144
    iget-wide v7, v6, Llp2;->T:J

    .line 145
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    .line 146
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    move-result-object v7

    .line 147
    invoke-static {v6, v5}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v5

    .line 148
    sget-object v8, Luz0;->j:Lpz2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    invoke-virtual {v6}, Llp2;->Z()V

    .line 150
    iget-boolean v8, v6, Llp2;->S:Z

    if-eqz v8, :cond_13

    .line 151
    invoke-virtual {v6}, Llp2;->k()V

    goto :goto_b

    .line 152
    :cond_13
    invoke-virtual {v6}, Llp2;->j0()V

    .line 153
    :goto_b
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 154
    invoke-static {v8, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 155
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 156
    invoke-static {v0, v6, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 157
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 158
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 159
    invoke-static {v2, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 160
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 161
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 162
    invoke-static {v0, v6, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 163
    sget v0, Ly46;->cancel:I

    invoke-static {v0, v6}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v40

    .line 164
    invoke-static {v6}, Lys0;->D(Llp2;)Lds;

    move-result-object v0

    .line 165
    iget-object v0, v0, Lds;->b:Lo88;

    .line 166
    invoke-static {v6}, Lys0;->y(Llp2;)Ldp;

    move-result-object v2

    .line 167
    iget-wide v7, v2, Ldp;->a:J

    const/16 v30, 0x0

    const v31, 0xfffffe

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    move-object/from16 v19, v0

    move-wide/from16 v20, v7

    .line 168
    invoke-static/range {v19 .. v31}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v43

    .line 169
    invoke-virtual {v6, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v6, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 170
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_14

    if-ne v2, v14, :cond_15

    .line 171
    :cond_14
    new-instance v2, Ljq6;

    const/4 v11, 0x1

    invoke-direct {v2, v3, v4, v11}, Ljq6;-><init>(Lpv3;Ldn2;B)V

    .line 172
    invoke-virtual {v6, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 173
    :cond_15
    check-cast v2, Lpv3;

    move-object/from16 v51, v2

    check-cast v51, Ldn2;

    const/high16 v53, 0x180000

    const/16 v54, 0xfb6

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v52, v6

    .line 174
    invoke-static/range {v40 .. v54}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    move-object/from16 v0, v52

    .line 175
    invoke-static {}, Lxq6;->a()Lkx4;

    move-result-object v2

    invoke-static {v0, v2}, Lch3;->f(Llp2;Lkx4;)V

    .line 176
    sget v2, Ly46;->routing_sub_select_title:I

    invoke-static {v2, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v19

    .line 177
    invoke-static {v0}, Lys0;->D(Llp2;)Lds;

    move-result-object v2

    .line 178
    iget-object v2, v2, Lds;->a:Lcs;

    .line 179
    iget-object v2, v2, Lcs;->c:Lo88;

    .line 180
    invoke-static {v0}, Lys0;->y(Llp2;)Ldp;

    move-result-object v4

    .line 181
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 182
    iget-wide v4, v4, Lxr;->a:J

    const/16 v31, 0x0

    const v32, 0xfffffe

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    move-object/from16 v20, v2

    move-wide/from16 v21, v4

    .line 183
    invoke-static/range {v20 .. v32}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v21

    const/high16 v29, 0x30000

    const/16 v30, 0x1da

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v28, v0

    .line 184
    invoke-static/range {v19 .. v30}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 185
    invoke-static {}, Lxq6;->a()Lkx4;

    move-result-object v2

    invoke-static {v0, v2}, Lch3;->f(Llp2;Lkx4;)V

    .line 186
    sget v2, Ly46;->done:I

    invoke-static {v2, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v40

    .line 187
    invoke-static {v0}, Lys0;->D(Llp2;)Lds;

    move-result-object v2

    .line 188
    iget-object v2, v2, Lds;->b:Lo88;

    .line 189
    invoke-static {v0}, Lys0;->y(Llp2;)Ldp;

    move-result-object v4

    .line 190
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 191
    iget-wide v4, v4, Lxr;->a:J

    const/16 v30, 0x0

    const v31, 0xfffffe

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    move-object/from16 v19, v2

    move-wide/from16 v20, v4

    .line 192
    invoke-static/range {v19 .. v31}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v43

    .line 193
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    .line 194
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_16

    if-ne v4, v14, :cond_17

    .line 195
    :cond_16
    new-instance v4, Laa3;

    const/4 v2, 0x7

    invoke-direct {v4, v3, v2}, Laa3;-><init>(Lpv3;B)V

    .line 196
    invoke-virtual {v0, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 197
    :cond_17
    move-object/from16 v51, v4

    check-cast v51, Ldn2;

    const/high16 v53, 0x180000

    const/16 v54, 0xfb6

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v52, v0

    .line 198
    invoke-static/range {v40 .. v54}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    const/4 v11, 0x1

    .line 199
    invoke-virtual {v0, v11}, Llp2;->p(Z)V

    const/high16 v5, 0x41c00000    # 24.0f

    .line 200
    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v2

    invoke-static {v0, v2}, Lch3;->f(Llp2;Lkx4;)V

    .line 201
    sget v2, Ly46;->routing_sub_select_description:I

    invoke-static {v2, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v19

    .line 202
    invoke-static {v0}, Lys0;->D(Llp2;)Lds;

    move-result-object v2

    .line 203
    iget-object v2, v2, Lds;->d:Lo88;

    .line 204
    invoke-static {v0}, Lys0;->y(Llp2;)Ldp;

    move-result-object v4

    .line 205
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 206
    iget-wide v4, v4, Lxr;->c:J

    const/16 v31, 0x0

    const v32, 0xfffffe

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    move-object/from16 v20, v2

    move-wide/from16 v21, v4

    .line 207
    invoke-static/range {v20 .. v32}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v21

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/high16 v13, 0x41800000    # 16.0f

    .line 208
    invoke-static {v1, v13, v2, v4}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v20

    const v29, 0x30030

    const/16 v30, 0x1d8

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v28, v0

    .line 209
    invoke-static/range {v19 .. v30}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    const/high16 v6, 0x41400000    # 12.0f

    .line 210
    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v2

    invoke-static {v0, v2}, Lch3;->f(Llp2;Lkx4;)V

    .line 211
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkq6;

    .line 212
    iget-boolean v2, v2, Lkq6;->c:Z

    const/4 v5, 0x0

    const/4 v11, 0x1

    .line 213
    invoke-static {v1, v5, v6, v11}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v21

    .line 214
    new-instance v4, Loq2;

    const/4 v10, 0x2

    invoke-direct {v4, v3, v15, v10}, Loq2;-><init>(Lpv3;Llh7;B)V

    const v3, 0x71f8aba2

    invoke-static {v3, v4, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v22

    const/16 v24, 0xdb0

    move-object/from16 v23, v0

    move-object/from16 v20, v1

    move/from16 v19, v2

    .line 215
    invoke-static/range {v19 .. v24}, Lhi5;->J(ZLkx4;Lkx4;Lzy0;Llp2;I)V

    goto :goto_c

    :cond_18
    move-object v0, v6

    .line 216
    invoke-virtual {v0}, Llp2;->Q()V

    :goto_c
    return-object v39

    :pswitch_1
    move-object/from16 v39, v6

    const/4 v13, 0x0

    .line 217
    check-cast v0, Lvv5;

    check-cast v4, Ldn2;

    check-cast v12, Ldn2;

    move-object/from16 v1, p1

    check-cast v1, Luw0;

    move-object/from16 v5, p2

    check-cast v5, Ldn2;

    move-object/from16 v6, p3

    check-cast v6, Llp2;

    move-object/from16 v7, p4

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit16 v1, v7, 0x81

    const/16 v5, 0x80

    if-eq v1, v5, :cond_19

    const/4 v11, 0x1

    :goto_d
    const/4 v1, 0x1

    goto :goto_e

    :cond_19
    move v11, v13

    goto :goto_d

    :goto_e
    and-int/lit8 v5, v7, 0x1

    invoke-virtual {v6, v5, v11}, Llp2;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 219
    iget-object v0, v0, Lvv5;->g:Lf76;

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    invoke-virtual {v6, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    .line 222
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_1a

    if-ne v5, v14, :cond_1b

    .line 223
    :cond_1a
    new-instance v5, Ljy2;

    const/16 v1, 0x14

    const/4 v7, 0x0

    invoke-direct {v5, v0, v4, v7, v1}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 224
    invoke-virtual {v6, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 225
    :cond_1b
    check-cast v5, Lrn2;

    invoke-static {v0, v4, v5, v6}, Lu70;->j(Ljava/lang/Object;Ljava/lang/Object;Lrn2;Llp2;)V

    .line 226
    sget-object v0, Lpz2;->o0:Lo50;

    .line 227
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    const/high16 v5, 0x41000000    # 8.0f

    const/high16 v13, 0x41800000    # 16.0f

    .line 228
    invoke-static {v1, v13, v5}, Los4;->y(Lkx4;FF)Lkx4;

    move-result-object v4

    const/16 v11, 0x30

    .line 229
    invoke-static {v2, v0, v6, v11}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    move-result-object v0

    .line 230
    iget-wide v7, v6, Llp2;->T:J

    .line 231
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    .line 232
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    move-result-object v5

    .line 233
    invoke-static {v6, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v4

    .line 234
    sget-object v7, Luz0;->j:Lpz2;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    invoke-virtual {v6}, Llp2;->Z()V

    .line 236
    iget-boolean v7, v6, Llp2;->S:Z

    if-eqz v7, :cond_1c

    .line 237
    invoke-virtual {v6}, Llp2;->k()V

    goto :goto_f

    .line 238
    :cond_1c
    invoke-virtual {v6}, Llp2;->j0()V

    .line 239
    :goto_f
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 240
    invoke-static {v7, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 241
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 242
    invoke-static {v0, v6, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 243
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 244
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 245
    invoke-static {v2, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 246
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 247
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 248
    invoke-static {v0, v6, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 249
    sget v0, Ly46;->cancel:I

    invoke-static {v0, v6}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v40

    .line 250
    sget-object v0, Les;->a:Lox1;

    .line 251
    invoke-virtual {v6, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v2

    .line 252
    check-cast v2, Lds;

    .line 253
    iget-object v2, v2, Lds;->b:Lo88;

    .line 254
    sget-object v4, Lep;->z:Lox1;

    .line 255
    invoke-virtual {v6, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v5

    .line 256
    check-cast v5, Ldp;

    .line 257
    iget-wide v7, v5, Ldp;->a:J

    const/16 v29, 0x0

    const v30, 0xfffffe

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move-object/from16 v18, v2

    move-wide/from16 v19, v7

    .line 258
    invoke-static/range {v18 .. v30}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v43

    .line 259
    invoke-virtual {v6, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    .line 260
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1d

    if-ne v5, v14, :cond_1e

    .line 261
    :cond_1d
    new-instance v5, Lnq2;

    const/4 v11, 0x1

    invoke-direct {v5, v3, v12, v11}, Lnq2;-><init>(Lpv3;Ldn2;B)V

    .line 262
    invoke-virtual {v6, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 263
    :cond_1e
    move-object/from16 v51, v5

    check-cast v51, Ldn2;

    const/high16 v53, 0x180000

    const/16 v54, 0xfb6

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v52, v6

    .line 264
    invoke-static/range {v40 .. v54}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    move-object/from16 v2, v52

    .line 265
    invoke-static {}, Lxq6;->a()Lkx4;

    move-result-object v5

    invoke-static {v2, v5}, Lch3;->f(Llp2;Lkx4;)V

    .line 266
    sget v5, Ly46;->routing_sub_select_title:I

    invoke-static {v5, v2}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v18

    .line 267
    invoke-virtual {v2, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v5

    .line 268
    check-cast v5, Lds;

    .line 269
    iget-object v5, v5, Lds;->a:Lcs;

    .line 270
    iget-object v5, v5, Lcs;->c:Lo88;

    .line 271
    invoke-virtual {v2, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v6

    .line 272
    check-cast v6, Ldp;

    .line 273
    iget-object v6, v6, Ldp;->c:Lxr;

    .line 274
    iget-wide v6, v6, Lxr;->a:J

    const/16 v30, 0x0

    const v31, 0xfffffe

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    move-object/from16 v19, v5

    move-wide/from16 v20, v6

    .line 275
    invoke-static/range {v19 .. v31}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v20

    const/high16 v28, 0x30000

    const/16 v29, 0x1da

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v2

    .line 276
    invoke-static/range {v18 .. v29}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 277
    invoke-static {}, Lxq6;->a()Lkx4;

    move-result-object v5

    invoke-static {v2, v5}, Lch3;->f(Llp2;Lkx4;)V

    .line 278
    sget v5, Ly46;->done:I

    invoke-static {v5, v2}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v40

    .line 279
    invoke-virtual {v2, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v0

    .line 280
    check-cast v0, Lds;

    .line 281
    iget-object v0, v0, Lds;->b:Lo88;

    .line 282
    invoke-virtual {v2, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v4

    .line 283
    check-cast v4, Ldp;

    .line 284
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 285
    iget-wide v4, v4, Lxr;->a:J

    const/16 v29, 0x0

    const v30, 0xfffffe

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move-object/from16 v18, v0

    move-wide/from16 v19, v4

    .line 286
    invoke-static/range {v18 .. v30}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    move-result-object v43

    .line 287
    invoke-virtual {v2, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    .line 288
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1f

    if-ne v4, v14, :cond_20

    .line 289
    :cond_1f
    new-instance v4, Lnq2;

    const/4 v10, 0x2

    invoke-direct {v4, v3, v12, v10}, Lnq2;-><init>(Lpv3;Ldn2;B)V

    .line 290
    invoke-virtual {v2, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 291
    :cond_20
    move-object/from16 v51, v4

    check-cast v51, Ldn2;

    const/high16 v53, 0x180000

    const/16 v54, 0xfb6

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v52, v2

    .line 292
    invoke-static/range {v40 .. v54}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    const/4 v11, 0x1

    .line 293
    invoke-virtual {v2, v11}, Llp2;->p(Z)V

    const/high16 v6, 0x41400000    # 12.0f

    .line 294
    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v0

    invoke-static {v2, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 295
    invoke-interface {v15}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnv5;

    .line 296
    iget-boolean v0, v0, Lnv5;->d:Z

    const/4 v5, 0x0

    .line 297
    invoke-static {v1, v5, v6, v11}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v20

    .line 298
    new-instance v4, Loq2;

    invoke-direct {v4, v3, v15, v11}, Loq2;-><init>(Lpv3;Llh7;B)V

    const v3, 0x658f2bf0

    invoke-static {v3, v4, v2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v21

    const/16 v23, 0xdb0

    move/from16 v18, v0

    move-object/from16 v19, v1

    move-object/from16 v22, v2

    .line 299
    invoke-static/range {v18 .. v23}, Lhi5;->J(ZLkx4;Lkx4;Lzy0;Llp2;I)V

    goto :goto_10

    :cond_21
    move-object v2, v6

    .line 300
    invoke-virtual {v2}, Llp2;->Q()V

    :goto_10
    return-object v39

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
