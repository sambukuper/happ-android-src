.class public final Lnh;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lw05;

.field public final synthetic j0:Lkd8;

.field public final synthetic k0:Ly78;

.field public final synthetic l0:Lmj0;

.field public final synthetic m0:Lrf;

.field public final synthetic n0:Ls73;

.field public final synthetic o0:Lgn2;

.field public final synthetic p0:Ldn2;

.field public final synthetic q0:Lfw8;

.field public final synthetic r0:Lgn2;


# direct methods
.method public constructor <init>(Lw05;Lkd8;Ly78;Lmj0;Lrf;Ls73;Lgn2;Ldn2;Lfw8;Lgn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnh;->i0:Lw05;

    .line 2
    .line 3
    iput-object p2, p0, Lnh;->j0:Lkd8;

    .line 4
    .line 5
    iput-object p3, p0, Lnh;->k0:Ly78;

    .line 6
    .line 7
    iput-object p4, p0, Lnh;->l0:Lmj0;

    .line 8
    .line 9
    iput-object p5, p0, Lnh;->m0:Lrf;

    .line 10
    .line 11
    iput-object p6, p0, Lnh;->n0:Ls73;

    .line 12
    .line 13
    iput-object p7, p0, Lnh;->o0:Lgn2;

    .line 14
    .line 15
    iput-object p8, p0, Lnh;->p0:Ldn2;

    .line 16
    .line 17
    iput-object p9, p0, Lnh;->q0:Lfw8;

    .line 18
    .line 19
    iput-object p10, p0, Lnh;->r0:Lgn2;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, Luy7;-><init>(ILq51;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lnh;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnh;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnh;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lc71;->X:Lc71;

    .line 17
    .line 18
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 12

    .line 1
    new-instance v0, Lnh;

    .line 2
    .line 3
    iget-object v9, p0, Lnh;->q0:Lfw8;

    .line 4
    .line 5
    iget-object v10, p0, Lnh;->r0:Lgn2;

    .line 6
    .line 7
    iget-object v1, p0, Lnh;->i0:Lw05;

    .line 8
    .line 9
    iget-object v2, p0, Lnh;->j0:Lkd8;

    .line 10
    .line 11
    iget-object v3, p0, Lnh;->k0:Ly78;

    .line 12
    .line 13
    iget-object v4, p0, Lnh;->l0:Lmj0;

    .line 14
    .line 15
    iget-object v5, p0, Lnh;->m0:Lrf;

    .line 16
    .line 17
    iget-object v6, p0, Lnh;->n0:Ls73;

    .line 18
    .line 19
    iget-object v7, p0, Lnh;->o0:Lgn2;

    .line 20
    .line 21
    iget-object v8, p0, Lnh;->p0:Ldn2;

    .line 22
    .line 23
    move-object v11, p1

    .line 24
    invoke-direct/range {v0 .. v11}, Lnh;-><init>(Lw05;Lkd8;Ly78;Lmj0;Lrf;Ls73;Lgn2;Ldn2;Lfw8;Lgn2;Lq51;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v0, Lnh;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lnh;->g0:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lb61;->n()V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lnh;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lb71;

    .line 30
    .line 31
    new-instance v4, Lq0;

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    iget-object v6, v0, Lnh;->j0:Lkd8;

    .line 35
    .line 36
    iget-object v7, v0, Lnh;->l0:Lmj0;

    .line 37
    .line 38
    invoke-direct {v4, v6, v7, v2, v5}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 39
    .line 40
    .line 41
    sget-object v5, Le71;->f0:Le71;

    .line 42
    .line 43
    invoke-static {v1, v2, v5, v4, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 44
    .line 45
    .line 46
    iget-object v4, v0, Lnh;->i0:Lw05;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    new-instance v5, Ly9;

    .line 51
    .line 52
    invoke-direct {v5, v4, v7, v2, v3}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x3

    .line 56
    invoke-static {v1, v2, v2, v5, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 57
    .line 58
    .line 59
    :cond_2
    new-instance v13, Lf81;

    .line 60
    .line 61
    iget-object v2, v0, Lnh;->k0:Ly78;

    .line 62
    .line 63
    invoke-direct {v13, v6, v2, v7, v1}, Lf81;-><init>(Lkd8;Ly78;Lmj0;Lb71;)V

    .line 64
    .line 65
    .line 66
    new-instance v8, Lkh;

    .line 67
    .line 68
    iget-object v9, v0, Lnh;->j0:Lkd8;

    .line 69
    .line 70
    iget-object v10, v0, Lnh;->n0:Ls73;

    .line 71
    .line 72
    iget-object v11, v0, Lnh;->l0:Lmj0;

    .line 73
    .line 74
    iget-object v12, v0, Lnh;->o0:Lgn2;

    .line 75
    .line 76
    iget-object v14, v0, Lnh;->k0:Ly78;

    .line 77
    .line 78
    iget-object v15, v0, Lnh;->p0:Ldn2;

    .line 79
    .line 80
    iget-object v1, v0, Lnh;->q0:Lfw8;

    .line 81
    .line 82
    iget-object v2, v0, Lnh;->r0:Lgn2;

    .line 83
    .line 84
    move-object/from16 v16, v1

    .line 85
    .line 86
    move-object/from16 v17, v2

    .line 87
    .line 88
    invoke-direct/range {v8 .. v17}, Lkh;-><init>(Lkd8;Ls73;Lmj0;Lgn2;Lf81;Ly78;Ldn2;Lfw8;Lgn2;)V

    .line 89
    .line 90
    .line 91
    iput-boolean v3, v0, Lnh;->g0:Z

    .line 92
    .line 93
    iget-object v1, v0, Lnh;->m0:Lrf;

    .line 94
    .line 95
    invoke-virtual {v1, v8, v0}, Lrf;->a(Lkh;Ls51;)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lc71;->X:Lc71;

    .line 99
    .line 100
    return-object v0
.end method
