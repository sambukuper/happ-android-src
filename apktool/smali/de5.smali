.class public final Lde5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo48;


# instance fields
.field public final synthetic X:Ly68;

.field public final synthetic Y:Lw58;

.field public final synthetic Z:Lq58;

.field public final synthetic f0:Lsn2;

.field public final synthetic g0:Z

.field public final synthetic h0:Z

.field public final synthetic i0:Lxz4;

.field public final synthetic j0:Lgg5;

.field public final synthetic k0:Li48;

.field public final synthetic l0:Lzy0;


# direct methods
.method public constructor <init>(Ly68;Lw58;Lq58;Lsn2;ZZLxz4;Lgg5;Li48;Lzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lde5;->X:Ly68;

    .line 5
    .line 6
    iput-object p2, p0, Lde5;->Y:Lw58;

    .line 7
    .line 8
    iput-object p3, p0, Lde5;->Z:Lq58;

    .line 9
    .line 10
    iput-object p4, p0, Lde5;->f0:Lsn2;

    .line 11
    .line 12
    iput-boolean p5, p0, Lde5;->g0:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lde5;->h0:Z

    .line 15
    .line 16
    iput-object p7, p0, Lde5;->i0:Lxz4;

    .line 17
    .line 18
    iput-object p8, p0, Lde5;->j0:Lgg5;

    .line 19
    .line 20
    iput-object p9, p0, Lde5;->k0:Li48;

    .line 21
    .line 22
    iput-object p10, p0, Lde5;->l0:Lzy0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final j(Lzy0;Llp2;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x2f57a28f

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, Llp2;->X(I)Llp2;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v2, 0x10

    .line 21
    .line 22
    :goto_0
    or-int v2, p3, v2

    .line 23
    .line 24
    and-int/lit8 v3, v2, 0x13

    .line 25
    .line 26
    const/16 v4, 0x12

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v3, v4, :cond_1

    .line 30
    .line 31
    move v3, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v3, 0x0

    .line 34
    :goto_1
    and-int/2addr v2, v5

    .line 35
    invoke-virtual {v1, v2, v3}, Llp2;->N(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iget-object v2, v0, Lde5;->X:Ly68;

    .line 42
    .line 43
    invoke-virtual {v2}, Ly68;->c()Lh48;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, Lh48;->Z:Ljava/lang/CharSequence;

    .line 48
    .line 49
    iget-object v3, v0, Lde5;->Y:Lw58;

    .line 50
    .line 51
    sget-object v4, Lqe4;->x0:Lqe4;

    .line 52
    .line 53
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iget-object v15, v0, Lde5;->l0:Lzy0;

    .line 58
    .line 59
    const/16 v17, 0x186

    .line 60
    .line 61
    sget-object v1, Ld78;->Y:Ld78;

    .line 62
    .line 63
    iget-object v4, v0, Lde5;->Z:Lq58;

    .line 64
    .line 65
    iget-object v5, v0, Lde5;->f0:Lsn2;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    iget-boolean v10, v0, Lde5;->g0:Z

    .line 71
    .line 72
    iget-boolean v11, v0, Lde5;->h0:Z

    .line 73
    .line 74
    iget-object v12, v0, Lde5;->i0:Lxz4;

    .line 75
    .line 76
    iget-object v13, v0, Lde5;->j0:Lgg5;

    .line 77
    .line 78
    iget-object v14, v0, Lde5;->k0:Li48;

    .line 79
    .line 80
    move-object/from16 v3, p1

    .line 81
    .line 82
    move-object/from16 v16, p2

    .line 83
    .line 84
    invoke-static/range {v1 .. v17}, Lpn7;->a(Ld78;Ljava/lang/CharSequence;Lzy0;Lq58;Lsn2;Lrn2;Lrn2;Lrn2;ZZZLxz4;Lgg5;Li48;Lzy0;Llp2;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-virtual/range {p2 .. p2}, Llp2;->Q()V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual/range {p2 .. p2}, Llp2;->r()Lj86;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    new-instance v2, Li9;

    .line 98
    .line 99
    const/16 v3, 0x18

    .line 100
    .line 101
    move-object/from16 v4, p1

    .line 102
    .line 103
    move/from16 v5, p3

    .line 104
    .line 105
    invoke-direct {v2, v3, v5, v0, v4}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object v2, v1, Lj86;->d:Lrn2;

    .line 109
    .line 110
    :cond_3
    return-void
.end method
