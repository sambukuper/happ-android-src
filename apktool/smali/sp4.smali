.class public final Lsp4;
.super Le41;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# static fields
.field public static final t0:Lba7;

.field public static final u0:Ldp3;


# instance fields
.field public final Z:Ld50;

.field public final f0:Z

.field public final g0:Ldh8;

.field public final h0:Ldh8;

.field public final i0:Lar3;

.field public final j0:Lar3;

.field public final k0:Lri8;

.field public l0:Lg33;

.field public final m0:Ljava/util/Set;

.field public final n0:Ljava/util/Set;

.field public final o0:Ljava/lang/Object;

.field public final p0:Ljava/lang/Object;

.field public final q0:Z

.field public final r0:Lzl;

.field public final s0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Luh8;->u0:Lba7;

    .line 2
    .line 3
    sput-object v0, Lsp4;->t0:Lba7;

    .line 4
    .line 5
    sget-object v0, Ldp3;->Z:Ldp3;

    .line 6
    .line 7
    sput-object v0, Lsp4;->u0:Ldp3;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;Ldh8;Ldh8;ZLri8;Lar3;Lar3;)V
    .locals 3

    const/4 v0, 0x0

    .line 82
    const-class v1, Ljava/util/Map;

    invoke-direct {p0, v0, v1}, Llj7;-><init>(ILjava/lang/Class;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 83
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move-object p1, v1

    :cond_1
    iput-object p1, p0, Lsp4;->m0:Ljava/util/Set;

    .line 84
    iput-object p2, p0, Lsp4;->n0:Ljava/util/Set;

    .line 85
    iput-object p3, p0, Lsp4;->g0:Ldh8;

    .line 86
    iput-object p4, p0, Lsp4;->h0:Ldh8;

    .line 87
    iput-boolean p5, p0, Lsp4;->f0:Z

    .line 88
    iput-object p6, p0, Lsp4;->k0:Lri8;

    .line 89
    iput-object p7, p0, Lsp4;->i0:Lar3;

    .line 90
    iput-object p8, p0, Lsp4;->j0:Lar3;

    .line 91
    sget-object p3, Lpx5;->f:Lpx5;

    .line 92
    iput-object p3, p0, Lsp4;->l0:Lg33;

    .line 93
    iput-object v1, p0, Lsp4;->Z:Ld50;

    .line 94
    iput-object v1, p0, Lsp4;->o0:Ljava/lang/Object;

    .line 95
    iput-boolean v0, p0, Lsp4;->s0:Z

    .line 96
    iput-object v1, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 97
    iput-boolean v0, p0, Lsp4;->q0:Z

    if-nez p2, :cond_2

    if-eqz p1, :cond_3

    .line 98
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    .line 99
    :cond_2
    new-instance v1, Lzl;

    invoke-direct {v1, p1, p2}, Lzl;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 100
    :cond_3
    :goto_0
    iput-object v1, p0, Lsp4;->r0:Lzl;

    return-void
.end method

.method public constructor <init>(Lsp4;Ld50;Lar3;Lar3;Ljava/util/Set;Ljava/util/Set;)V
    .locals 2

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v1, v0}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p5, :cond_0

    .line 9
    .line 10
    invoke-interface {p5}, Ljava/util/Set;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object p5, v0

    .line 17
    :cond_1
    iput-object p5, p0, Lsp4;->m0:Ljava/util/Set;

    .line 18
    .line 19
    iput-object p6, p0, Lsp4;->n0:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v1, p1, Lsp4;->g0:Ldh8;

    .line 22
    .line 23
    iput-object v1, p0, Lsp4;->g0:Ldh8;

    .line 24
    .line 25
    iget-object v1, p1, Lsp4;->h0:Ldh8;

    .line 26
    .line 27
    iput-object v1, p0, Lsp4;->h0:Ldh8;

    .line 28
    .line 29
    iget-boolean v1, p1, Lsp4;->f0:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Lsp4;->f0:Z

    .line 32
    .line 33
    iget-object v1, p1, Lsp4;->k0:Lri8;

    .line 34
    .line 35
    iput-object v1, p0, Lsp4;->k0:Lri8;

    .line 36
    .line 37
    iput-object p3, p0, Lsp4;->i0:Lar3;

    .line 38
    .line 39
    iput-object p4, p0, Lsp4;->j0:Lar3;

    .line 40
    .line 41
    sget-object p3, Lpx5;->f:Lpx5;

    .line 42
    .line 43
    iput-object p3, p0, Lsp4;->l0:Lg33;

    .line 44
    .line 45
    iput-object p2, p0, Lsp4;->Z:Ld50;

    .line 46
    .line 47
    iget-object p2, p1, Lsp4;->o0:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object p2, p0, Lsp4;->o0:Ljava/lang/Object;

    .line 50
    .line 51
    iget-boolean p2, p1, Lsp4;->s0:Z

    .line 52
    .line 53
    iput-boolean p2, p0, Lsp4;->s0:Z

    .line 54
    .line 55
    iget-object p2, p1, Lsp4;->p0:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object p2, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 58
    .line 59
    iget-boolean p1, p1, Lsp4;->q0:Z

    .line 60
    .line 61
    iput-boolean p1, p0, Lsp4;->q0:Z

    .line 62
    .line 63
    if-nez p6, :cond_2

    .line 64
    .line 65
    if-eqz p5, :cond_3

    .line 66
    .line 67
    invoke-interface {p5}, Ljava/util/Set;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    new-instance v0, Lzl;

    .line 75
    .line 76
    invoke-direct {v0, p5, p6}, Lzl;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    :goto_0
    iput-object v0, p0, Lsp4;->r0:Lzl;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Lsp4;Ljava/lang/Object;Z)V
    .locals 2

    .line 118
    const-class v0, Ljava/util/Map;

    const/4 v1, 0x0

    .line 119
    invoke-direct {p0, v1, v0}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 120
    iget-object v0, p1, Lsp4;->m0:Ljava/util/Set;

    iput-object v0, p0, Lsp4;->m0:Ljava/util/Set;

    .line 121
    iget-object v0, p1, Lsp4;->n0:Ljava/util/Set;

    iput-object v0, p0, Lsp4;->n0:Ljava/util/Set;

    .line 122
    iget-object v0, p1, Lsp4;->g0:Ldh8;

    iput-object v0, p0, Lsp4;->g0:Ldh8;

    .line 123
    iget-object v0, p1, Lsp4;->h0:Ldh8;

    iput-object v0, p0, Lsp4;->h0:Ldh8;

    .line 124
    iget-boolean v0, p1, Lsp4;->f0:Z

    iput-boolean v0, p0, Lsp4;->f0:Z

    .line 125
    iget-object v0, p1, Lsp4;->k0:Lri8;

    iput-object v0, p0, Lsp4;->k0:Lri8;

    .line 126
    iget-object v0, p1, Lsp4;->i0:Lar3;

    iput-object v0, p0, Lsp4;->i0:Lar3;

    .line 127
    iget-object v0, p1, Lsp4;->j0:Lar3;

    iput-object v0, p0, Lsp4;->j0:Lar3;

    .line 128
    sget-object v0, Lpx5;->f:Lpx5;

    .line 129
    iput-object v0, p0, Lsp4;->l0:Lg33;

    .line 130
    iget-object v0, p1, Lsp4;->Z:Ld50;

    iput-object v0, p0, Lsp4;->Z:Ld50;

    .line 131
    iput-object p2, p0, Lsp4;->o0:Ljava/lang/Object;

    .line 132
    iput-boolean p3, p0, Lsp4;->s0:Z

    .line 133
    iget-object p2, p1, Lsp4;->p0:Ljava/lang/Object;

    iput-object p2, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 134
    iget-boolean p2, p1, Lsp4;->q0:Z

    iput-boolean p2, p0, Lsp4;->q0:Z

    .line 135
    iget-object p1, p1, Lsp4;->r0:Lzl;

    iput-object p1, p0, Lsp4;->r0:Lzl;

    return-void
.end method

.method public constructor <init>(Lsp4;Lri8;Ljava/lang/Object;Z)V
    .locals 2

    .line 101
    const-class v0, Ljava/util/Map;

    const/4 v1, 0x0

    .line 102
    invoke-direct {p0, v1, v0}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 103
    iget-object v0, p1, Lsp4;->m0:Ljava/util/Set;

    iput-object v0, p0, Lsp4;->m0:Ljava/util/Set;

    .line 104
    iget-object v0, p1, Lsp4;->n0:Ljava/util/Set;

    iput-object v0, p0, Lsp4;->n0:Ljava/util/Set;

    .line 105
    iget-object v0, p1, Lsp4;->g0:Ldh8;

    iput-object v0, p0, Lsp4;->g0:Ldh8;

    .line 106
    iget-object v0, p1, Lsp4;->h0:Ldh8;

    iput-object v0, p0, Lsp4;->h0:Ldh8;

    .line 107
    iget-boolean v0, p1, Lsp4;->f0:Z

    iput-boolean v0, p0, Lsp4;->f0:Z

    .line 108
    iput-object p2, p0, Lsp4;->k0:Lri8;

    .line 109
    iget-object p2, p1, Lsp4;->i0:Lar3;

    iput-object p2, p0, Lsp4;->i0:Lar3;

    .line 110
    iget-object p2, p1, Lsp4;->j0:Lar3;

    iput-object p2, p0, Lsp4;->j0:Lar3;

    .line 111
    iget-object p2, p1, Lsp4;->l0:Lg33;

    iput-object p2, p0, Lsp4;->l0:Lg33;

    .line 112
    iget-object p2, p1, Lsp4;->Z:Ld50;

    iput-object p2, p0, Lsp4;->Z:Ld50;

    .line 113
    iget-object p2, p1, Lsp4;->o0:Ljava/lang/Object;

    iput-object p2, p0, Lsp4;->o0:Ljava/lang/Object;

    .line 114
    iget-boolean p2, p1, Lsp4;->s0:Z

    iput-boolean p2, p0, Lsp4;->s0:Z

    .line 115
    iput-object p3, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 116
    iput-boolean p4, p0, Lsp4;->q0:Z

    .line 117
    iget-object p1, p1, Lsp4;->r0:Lzl;

    iput-object p1, p0, Lsp4;->r0:Lzl;

    return-void
.end method

.method public static q(Ljava/util/Set;Ljava/util/Set;Ldh8;ZLsi8;Lar3;Lar3;Ljava/lang/Object;)Lsp4;
    .locals 11

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lsp4;->t0:Lba7;

    .line 6
    .line 7
    move-object v5, p2

    .line 8
    move-object v6, v5

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p2}, Ldh8;->C0()Ldh8;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-class v2, Ljava/util/Properties;

    .line 15
    .line 16
    invoke-virtual {p2, v2}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    sget-object p2, Luh8;->u0:Lba7;

    .line 23
    .line 24
    :goto_0
    move-object v6, p2

    .line 25
    move-object v5, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p2}, Ldh8;->z0()Ldh8;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    const/4 p2, 0x0

    .line 33
    if-nez p3, :cond_4

    .line 34
    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    iget-object p3, v6, Ldh8;->j0:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Class;->getModifiers()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    invoke-static {p3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    const/4 p3, 0x1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move p3, p2

    .line 52
    :cond_3
    :goto_2
    move v7, p3

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    iget-object v1, v6, Ldh8;->j0:Ljava/lang/Class;

    .line 55
    .line 56
    const-class v2, Ljava/lang/Object;

    .line 57
    .line 58
    if-ne v1, v2, :cond_3

    .line 59
    .line 60
    move v7, p2

    .line 61
    :goto_3
    new-instance v2, Lsp4;

    .line 62
    .line 63
    move-object v3, p0

    .line 64
    move-object v4, p1

    .line 65
    move-object v8, p4

    .line 66
    move-object/from16 v9, p5

    .line 67
    .line 68
    move-object/from16 v10, p6

    .line 69
    .line 70
    invoke-direct/range {v2 .. v10}, Lsp4;-><init>(Ljava/util/Set;Ljava/util/Set;Ldh8;Ldh8;ZLri8;Lar3;Lar3;)V

    .line 71
    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    const-string p0, "withFilterId"

    .line 76
    .line 77
    const-class p1, Lsp4;

    .line 78
    .line 79
    invoke-static {p1, v2, p0}, Lit0;->x(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance p0, Lsp4;

    .line 83
    .line 84
    invoke-direct {p0, v2, v0, p2}, Lsp4;-><init>(Lsp4;Ljava/lang/Object;Z)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_5
    return-object v2
.end method


# virtual methods
.method public final a(Lt37;Ld50;)Lar3;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v8, v7, Lt37;->X:Ll37;

    .line 8
    .line 9
    invoke-virtual {v8}, Lvp4;->d()Lm85;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v2}, Ld50;->b()Lgl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v11, v0

    .line 22
    :goto_0
    if-eqz v11, :cond_3

    .line 23
    .line 24
    invoke-virtual {v9, v11}, Lm85;->k(Lvj8;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v7, v11, v0}, Lt37;->D(Lvj8;Ljava/lang/Object;)Lar3;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_1
    invoke-virtual {v9, v11}, Lm85;->c(Lvj8;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v7, v11, v3}, Lt37;->D(Lvj8;Ljava/lang/Object;)Lar3;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_3

    .line 47
    :cond_2
    :goto_2
    const/4 v3, 0x0

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/4 v0, 0x0

    .line 50
    goto :goto_2

    .line 51
    :goto_3
    if-nez v3, :cond_4

    .line 52
    .line 53
    iget-object v3, v1, Lsp4;->j0:Lar3;

    .line 54
    .line 55
    :cond_4
    invoke-static {v7, v2, v3}, Llj7;->j(Lt37;Ld50;Lar3;)Lar3;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget-object v12, v1, Lsp4;->h0:Ldh8;

    .line 60
    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    iget-boolean v4, v1, Lsp4;->f0:Z

    .line 64
    .line 65
    if-eqz v4, :cond_5

    .line 66
    .line 67
    invoke-virtual {v12}, Ldh8;->K0()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_5

    .line 72
    .line 73
    invoke-virtual {v7, v12, v2}, Lt37;->i(Ldh8;Ld50;)Lar3;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :cond_5
    move-object v4, v3

    .line 78
    if-nez v0, :cond_6

    .line 79
    .line 80
    iget-object v0, v1, Lsp4;->i0:Lar3;

    .line 81
    .line 82
    :cond_6
    if-nez v0, :cond_7

    .line 83
    .line 84
    iget-object v0, v1, Lsp4;->g0:Ldh8;

    .line 85
    .line 86
    invoke-virtual {v7, v0, v2}, Lt37;->k(Ldh8;Ld50;)Lar3;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :goto_4
    move-object v3, v0

    .line 91
    goto :goto_5

    .line 92
    :cond_7
    invoke-virtual {v7, v0, v2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_4

    .line 97
    :goto_5
    const/4 v13, 0x0

    .line 98
    iget-object v0, v1, Lsp4;->m0:Ljava/util/Set;

    .line 99
    .line 100
    iget-object v5, v1, Lsp4;->n0:Ljava/util/Set;

    .line 101
    .line 102
    if-eqz v11, :cond_d

    .line 103
    .line 104
    invoke-virtual {v9, v11}, Lm85;->v(Lvj8;)Lyo3;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-boolean v14, v6, Lyo3;->Z:Z

    .line 109
    .line 110
    if-eqz v14, :cond_8

    .line 111
    .line 112
    sget-object v6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_8
    iget-object v6, v6, Lyo3;->X:Ljava/util/Set;

    .line 116
    .line 117
    :goto_6
    if-eqz v6, :cond_a

    .line 118
    .line 119
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    if-nez v14, :cond_a

    .line 124
    .line 125
    if-nez v0, :cond_9

    .line 126
    .line 127
    new-instance v0, Ljava/util/HashSet;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 130
    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_9
    new-instance v14, Ljava/util/HashSet;

    .line 134
    .line 135
    invoke-direct {v14, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 136
    .line 137
    .line 138
    move-object v0, v14

    .line 139
    :goto_7
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_a

    .line 148
    .line 149
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v0, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_a
    invoke-virtual {v9, v11}, Lm85;->y(Lvj8;)Lgp3;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iget-object v6, v6, Lgp3;->X:Ljava/util/Set;

    .line 164
    .line 165
    if-eqz v6, :cond_c

    .line 166
    .line 167
    if-nez v5, :cond_b

    .line 168
    .line 169
    new-instance v5, Ljava/util/HashSet;

    .line 170
    .line 171
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_b
    new-instance v14, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v14, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 178
    .line 179
    .line 180
    move-object v5, v14

    .line 181
    :goto_9
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-eqz v14, :cond_c

    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    check-cast v14, Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {v5, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_c
    invoke-virtual {v9, v11}, Lm85;->G(Lvj8;)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v14, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    move-object/from16 v16, v5

    .line 212
    .line 213
    move-object v5, v0

    .line 214
    move v0, v6

    .line 215
    move-object/from16 v6, v16

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_d
    move-object v6, v5

    .line 219
    move-object v5, v0

    .line 220
    move v0, v13

    .line 221
    :goto_b
    const-class v14, Ljava/util/Map;

    .line 222
    .line 223
    invoke-static {v7, v2, v14}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    if-eqz v15, :cond_e

    .line 228
    .line 229
    sget-object v10, Lko3;->Y:Lko3;

    .line 230
    .line 231
    invoke-virtual {v15, v10}, Lno3;->a(Lko3;)Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    if-eqz v10, :cond_e

    .line 236
    .line 237
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    :cond_e
    move v10, v0

    .line 242
    const-class v15, Lsp4;

    .line 243
    .line 244
    const-string v0, "withResolved"

    .line 245
    .line 246
    invoke-static {v15, v1, v0}, Lit0;->x(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Lsp4;

    .line 250
    .line 251
    invoke-direct/range {v0 .. v6}, Lsp4;-><init>(Lsp4;Ld50;Lar3;Lar3;Ljava/util/Set;Ljava/util/Set;)V

    .line 252
    .line 253
    .line 254
    iget-boolean v3, v0, Lsp4;->s0:Z

    .line 255
    .line 256
    if-eq v10, v3, :cond_f

    .line 257
    .line 258
    new-instance v3, Lsp4;

    .line 259
    .line 260
    iget-object v1, v1, Lsp4;->o0:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-direct {v3, v0, v1, v10}, Lsp4;-><init>(Lsp4;Ljava/lang/Object;Z)V

    .line 263
    .line 264
    .line 265
    move-object v0, v3

    .line 266
    :cond_f
    if-eqz v11, :cond_11

    .line 267
    .line 268
    invoke-virtual {v9, v11}, Lm85;->g(Lvj8;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    if-eqz v1, :cond_11

    .line 273
    .line 274
    iget-object v3, v0, Lsp4;->o0:Ljava/lang/Object;

    .line 275
    .line 276
    if-ne v3, v1, :cond_10

    .line 277
    .line 278
    goto :goto_c

    .line 279
    :cond_10
    const-string v3, "withFilterId"

    .line 280
    .line 281
    invoke-static {v15, v0, v3}, Lit0;->x(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    new-instance v3, Lsp4;

    .line 285
    .line 286
    iget-boolean v4, v0, Lsp4;->s0:Z

    .line 287
    .line 288
    invoke-direct {v3, v0, v1, v4}, Lsp4;-><init>(Lsp4;Ljava/lang/Object;Z)V

    .line 289
    .line 290
    .line 291
    move-object v0, v3

    .line 292
    :cond_11
    :goto_c
    if-eqz v2, :cond_12

    .line 293
    .line 294
    invoke-interface {v2, v8, v14}, Ld50;->e(Lvp4;Ljava/lang/Class;)Lep3;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    goto :goto_d

    .line 299
    :cond_12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    sget-object v1, Lep3;->g0:Lep3;

    .line 303
    .line 304
    :goto_d
    if-eqz v1, :cond_1b

    .line 305
    .line 306
    iget-object v2, v1, Lep3;->Y:Ldp3;

    .line 307
    .line 308
    sget-object v3, Ldp3;->g0:Ldp3;

    .line 309
    .line 310
    if-eq v2, v3, :cond_1b

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    const/4 v3, 0x1

    .line 317
    if-eq v2, v3, :cond_1a

    .line 318
    .line 319
    const/4 v4, 0x2

    .line 320
    sget-object v5, Lsp4;->u0:Ldp3;

    .line 321
    .line 322
    if-eq v2, v4, :cond_18

    .line 323
    .line 324
    const/4 v4, 0x3

    .line 325
    if-eq v2, v4, :cond_17

    .line 326
    .line 327
    const/4 v4, 0x4

    .line 328
    if-eq v2, v4, :cond_16

    .line 329
    .line 330
    const/4 v4, 0x5

    .line 331
    if-eq v2, v4, :cond_13

    .line 332
    .line 333
    :goto_e
    const/4 v10, 0x0

    .line 334
    goto :goto_10

    .line 335
    :cond_13
    iget-object v1, v1, Lep3;->f0:Ljava/lang/Class;

    .line 336
    .line 337
    invoke-virtual {v7, v1}, Lt37;->w(Ljava/lang/Class;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    if-nez v10, :cond_15

    .line 342
    .line 343
    :cond_14
    :goto_f
    move v13, v3

    .line 344
    goto :goto_10

    .line 345
    :cond_15
    invoke-virtual {v7, v10}, Lt37;->x(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    goto :goto_10

    .line 350
    :cond_16
    invoke-static {v12}, Lci8;->r(Ldh8;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    if-eqz v10, :cond_14

    .line 355
    .line 356
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_14

    .line 365
    .line 366
    invoke-static {v10}, Lz51;->y(Ljava/lang/Object;)Lne;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    goto :goto_f

    .line 371
    :cond_17
    move v13, v3

    .line 372
    move-object v10, v5

    .line 373
    goto :goto_10

    .line 374
    :cond_18
    invoke-virtual {v12}, Lmb6;->M()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_19

    .line 379
    .line 380
    move-object v10, v5

    .line 381
    goto :goto_f

    .line 382
    :cond_19
    const/4 v10, 0x0

    .line 383
    goto :goto_f

    .line 384
    :cond_1a
    move v13, v3

    .line 385
    goto :goto_e

    .line 386
    :goto_10
    invoke-virtual {v0, v10, v13}, Lsp4;->t(Ljava/lang/Object;Z)Lsp4;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    :cond_1b
    return-object v0
.end method

.method public final c(Lt37;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    check-cast p2, Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lsp4;->q0:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_1
    sget-object v4, Lsp4;->u0:Ldp3;

    .line 24
    .line 25
    if-ne v4, v3, :cond_2

    .line 26
    .line 27
    move v4, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v4, v2

    .line 30
    :goto_0
    iget-object v5, p0, Lsp4;->j0:Lar3;

    .line 31
    .line 32
    if-eqz v5, :cond_6

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_b

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-nez p2, :cond_4

    .line 53
    .line 54
    if-eqz v0, :cond_a

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v5, p1, p2}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    if-eqz v3, :cond_a

    .line 67
    .line 68
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    :cond_7
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_b

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v5, :cond_8

    .line 94
    .line 95
    if-eqz v0, :cond_a

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_8
    :try_start_0
    invoke-virtual {p0, p1, v5}, Lsp4;->p(Lt37;Ljava/lang/Object;)Lar3;

    .line 99
    .line 100
    .line 101
    move-result-object v6
    :try_end_0
    .catch Lmb1; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    if-eqz v4, :cond_9

    .line 103
    .line 104
    invoke-virtual {v6, p1, v5}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-nez v5, :cond_7

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_9
    if-eqz v3, :cond_a

    .line 112
    .line 113
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_7

    .line 118
    .line 119
    :catch_0
    :cond_a
    :goto_3
    return v2

    .line 120
    :cond_b
    :goto_4
    return v1
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lro3;->a1(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lsp4;->s(Ljava/util/Map;Lro3;Lt37;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lro3;->J()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lgr3;->f0:Lgr3;

    .line 7
    .line 8
    invoke-virtual {p4, p1, v0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p4, p2, v0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lsp4;->s(Ljava/util/Map;Lro3;Lt37;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p4, p2, v0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o(Lri8;)Le41;
    .locals 3

    .line 1
    iget-object v0, p0, Lsp4;->k0:Lri8;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "_withValueTypeSerializer"

    .line 7
    .line 8
    const-class v1, Lsp4;

    .line 9
    .line 10
    invoke-static {v1, p0, v0}, Lit0;->x(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lsp4;

    .line 14
    .line 15
    iget-object v1, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 16
    .line 17
    iget-boolean v2, p0, Lsp4;->q0:Z

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, v1, v2}, Lsp4;-><init>(Lsp4;Lri8;Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final p(Lt37;Ljava/lang/Object;)Lar3;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lsp4;->l0:Lg33;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lg33;->R(Ljava/lang/Class;)Lar3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lsp4;->h0:Ldh8;

    .line 15
    .line 16
    invoke-virtual {v0}, Ldh8;->F0()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lsp4;->l0:Lg33;

    .line 21
    .line 22
    iget-object v3, p0, Lsp4;->Z:Ld50;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v0, p2}, Lt37;->e(Ldh8;Ljava/lang/Class;)Ldh8;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {v2, p2, p1, v3}, Lg33;->r(Ldh8;Lt37;Ld50;)Lzz2;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p1, Lzz2;->Z:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Lg33;

    .line 37
    .line 38
    if-eq v2, p2, :cond_1

    .line 39
    .line 40
    iput-object p2, p0, Lsp4;->l0:Lg33;

    .line 41
    .line 42
    :cond_1
    iget-object p0, p1, Lzz2;->Y:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lar3;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2, v3}, Lt37;->j(Ljava/lang/Class;Ld50;)Lar3;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v2, p2, p1}, Lg33;->J(Ljava/lang/Class;Lar3;)Lg33;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-eq v2, p2, :cond_3

    .line 59
    .line 60
    iput-object p2, p0, Lsp4;->l0:Lg33;

    .line 61
    .line 62
    :cond_3
    return-object p1
.end method

.method public final r(Ljava/util/Map;Lro3;Lt37;Ljava/lang/Object;)V
    .locals 7

    .line 1
    sget-object v0, Lsp4;->u0:Ldp3;

    .line 2
    .line 3
    if-ne v0, p4, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_8

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    iget-object v4, p3, Lt37;->i0:Lc75;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget-object v4, p0, Lsp4;->r0:Lzl;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4, v3}, Lzl;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v4, p0, Lsp4;->i0:Lar3;

    .line 49
    .line 50
    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_4

    .line 55
    .line 56
    iget-boolean v5, p0, Lsp4;->q0:Z

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-object v5, p3, Lt37;->h0:Lar3;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    iget-object v5, p0, Lsp4;->j0:Lar3;

    .line 65
    .line 66
    if-nez v5, :cond_5

    .line 67
    .line 68
    invoke-virtual {p0, p3, v2}, Lsp4;->p(Lt37;Ljava/lang/Object;)Lar3;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :cond_5
    if-eqz v0, :cond_6

    .line 73
    .line 74
    invoke-virtual {v5, p3, v2}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_7

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    if-eqz p4, :cond_7

    .line 82
    .line 83
    invoke-virtual {p4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_7

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    :goto_3
    invoke-virtual {v4, v3, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 91
    .line 92
    .line 93
    :try_start_0
    iget-object v4, p0, Lsp4;->k0:Lri8;

    .line 94
    .line 95
    invoke-virtual {v5, v2, p2, p3, v4}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catch_0
    move-exception p0

    .line 100
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p3, p0, p1, p2}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    throw p0

    .line 109
    :cond_8
    return-void
.end method

.method public final s(Ljava/util/Map;Lro3;Lt37;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_24

    .line 14
    .line 15
    iget-boolean v4, v0, Lsp4;->s0:Z

    .line 16
    .line 17
    sget-object v5, Lsp4;->u0:Ldp3;

    .line 18
    .line 19
    iget-object v6, v0, Lsp4;->p0:Ljava/lang/Object;

    .line 20
    .line 21
    iget-boolean v7, v0, Lsp4;->q0:Z

    .line 22
    .line 23
    iget-object v8, v0, Lsp4;->j0:Lar3;

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    sget-object v4, Ln37;->x0:Ln37;

    .line 29
    .line 30
    iget-object v10, v3, Lt37;->X:Ll37;

    .line 31
    .line 32
    invoke-virtual {v10, v4}, Ll37;->j(Ln37;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_d

    .line 37
    .line 38
    :cond_0
    instance-of v4, v1, Ljava/util/SortedMap;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-class v10, Ljava/lang/Comparable;

    .line 65
    .line 66
    invoke-virtual {v10, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-nez v10, :cond_5

    .line 71
    .line 72
    sget-object v10, Ln37;->y0:Ln37;

    .line 73
    .line 74
    iget-object v11, v3, Lt37;->X:Ll37;

    .line 75
    .line 76
    invoke-virtual {v11, v10}, Ll37;->j(Ln37;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_3

    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_3
    if-nez v4, :cond_4

    .line 85
    .line 86
    const-class v0, Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_0
    invoke-static {v4}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v4, "Cannot order Map entries by key of incomparable type "

    .line 100
    .line 101
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", consider disabling `SerializationFeature.FAIL_ON_ORDER_MAP_BY_INCOMPARABLE_KEY` to simply skip sorting"

    .line 108
    .line 109
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v3, v0, v1}, Lt37;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    throw v9

    .line 120
    :cond_5
    instance-of v4, v1, Ljava/util/HashMap;

    .line 121
    .line 122
    if-eqz v4, :cond_c

    .line 123
    .line 124
    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_c

    .line 129
    .line 130
    new-instance v4, Ljava/util/TreeMap;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_b

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    check-cast v10, Ljava/util/Map$Entry;

    .line 154
    .line 155
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    if-nez v11, :cond_a

    .line 160
    .line 161
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    iget-object v11, v3, Lt37;->i0:Lc75;

    .line 166
    .line 167
    if-nez v10, :cond_6

    .line 168
    .line 169
    if-eqz v7, :cond_9

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_6
    if-nez v8, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0, v3, v10}, Lsp4;->p(Lt37;Ljava/lang/Object;)Lar3;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    goto :goto_2

    .line 179
    :cond_7
    move-object v12, v8

    .line 180
    :goto_2
    if-ne v6, v5, :cond_8

    .line 181
    .line 182
    invoke-virtual {v12, v3, v10}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_9

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_8
    if-eqz v6, :cond_9

    .line 190
    .line 191
    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-eqz v12, :cond_9

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_9
    :try_start_0
    invoke-virtual {v11, v9, v2, v3}, Lc75;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 199
    .line 200
    .line 201
    throw v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :catch_0
    move-exception v0

    .line 203
    const-string v1, ""

    .line 204
    .line 205
    invoke-static {v3, v0, v10, v1}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v9

    .line 209
    :cond_a
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-virtual {v4, v11, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_b
    :goto_3
    move-object v1, v4

    .line 218
    goto :goto_4

    .line 219
    :cond_c
    new-instance v4, Ljava/util/TreeMap;

    .line 220
    .line 221
    invoke-direct {v4, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_d
    :goto_4
    iget-object v4, v0, Lsp4;->o0:Ljava/lang/Object;

    .line 226
    .line 227
    if-nez v4, :cond_23

    .line 228
    .line 229
    iget-object v4, v0, Lsp4;->r0:Lzl;

    .line 230
    .line 231
    iget-object v10, v0, Lsp4;->k0:Lri8;

    .line 232
    .line 233
    iget-object v11, v0, Lsp4;->i0:Lar3;

    .line 234
    .line 235
    if-nez v6, :cond_19

    .line 236
    .line 237
    if-eqz v7, :cond_e

    .line 238
    .line 239
    goto/16 :goto_a

    .line 240
    .line 241
    :cond_e
    if-eqz v8, :cond_13

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_24

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Ljava/util/Map$Entry;

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    if-eqz v4, :cond_f

    .line 268
    .line 269
    invoke-virtual {v4, v6}, Lzl;->g(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-eqz v7, :cond_f

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_f
    if-eqz v6, :cond_12

    .line 277
    .line 278
    invoke-virtual {v11, v6, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    if-nez v5, :cond_10

    .line 286
    .line 287
    invoke-virtual {v3, v2}, Lt37;->h(Lro3;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_10
    if-nez v10, :cond_11

    .line 292
    .line 293
    :try_start_1
    invoke-virtual {v8, v5, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :catch_1
    move-exception v0

    .line 298
    goto :goto_6

    .line 299
    :cond_11
    invoke-virtual {v8, v5, v2, v3, v10}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 300
    .line 301
    .line 302
    goto :goto_5

    .line 303
    :goto_6
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-static {v3, v0, v1, v2}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v9

    .line 311
    :cond_12
    iget-object v0, v3, Lt37;->i0:Lc75;

    .line 312
    .line 313
    invoke-virtual {v0, v9, v2, v3}, Lc75;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 314
    .line 315
    .line 316
    throw v9

    .line 317
    :cond_13
    if-eqz v10, :cond_14

    .line 318
    .line 319
    invoke-virtual {v0, v1, v2, v3, v9}, Lsp4;->r(Ljava/util/Map;Lro3;Lt37;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :cond_14
    :try_start_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 331
    move-object v6, v9

    .line 332
    :goto_7
    :try_start_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    if-eqz v7, :cond_24

    .line 337
    .line 338
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    check-cast v7, Ljava/util/Map$Entry;

    .line 343
    .line 344
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    if-eqz v6, :cond_18

    .line 353
    .line 354
    if-eqz v4, :cond_15

    .line 355
    .line 356
    invoke-virtual {v4, v6}, Lzl;->g(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_15

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :catch_2
    move-exception v0

    .line 364
    goto :goto_9

    .line 365
    :cond_15
    invoke-virtual {v11, v6, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 366
    .line 367
    .line 368
    if-nez v10, :cond_16

    .line 369
    .line 370
    invoke-virtual {v3, v2}, Lt37;->h(Lro3;)V

    .line 371
    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_16
    if-nez v8, :cond_17

    .line 375
    .line 376
    invoke-virtual {v0, v3, v10}, Lsp4;->p(Lt37;Ljava/lang/Object;)Lar3;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    goto :goto_8

    .line 381
    :cond_17
    move-object v7, v8

    .line 382
    :goto_8
    invoke-virtual {v7, v10, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_18
    iget-object v0, v3, Lt37;->i0:Lc75;

    .line 387
    .line 388
    invoke-virtual {v0, v9, v2, v3}, Lc75;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 389
    .line 390
    .line 391
    throw v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 392
    :catch_3
    move-exception v0

    .line 393
    move-object v6, v9

    .line 394
    :goto_9
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-static {v3, v0, v1, v2}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v9

    .line 402
    :cond_19
    :goto_a
    if-eqz v10, :cond_1a

    .line 403
    .line 404
    invoke-virtual {v0, v1, v2, v3, v6}, Lsp4;->r(Ljava/util/Map;Lro3;Lt37;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :cond_1a
    if-ne v5, v6, :cond_1b

    .line 409
    .line 410
    const/4 v5, 0x1

    .line 411
    goto :goto_b

    .line 412
    :cond_1b
    const/4 v5, 0x0

    .line 413
    :goto_b
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    if-eqz v12, :cond_24

    .line 426
    .line 427
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v12

    .line 431
    check-cast v12, Ljava/util/Map$Entry;

    .line 432
    .line 433
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    if-nez v13, :cond_1c

    .line 438
    .line 439
    iget-object v14, v3, Lt37;->i0:Lc75;

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_1c
    if-eqz v4, :cond_1d

    .line 443
    .line 444
    invoke-virtual {v4, v13}, Lzl;->g(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v14

    .line 448
    if-eqz v14, :cond_1d

    .line 449
    .line 450
    goto :goto_c

    .line 451
    :cond_1d
    move-object v14, v11

    .line 452
    :goto_d
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    if-nez v12, :cond_1f

    .line 457
    .line 458
    if-eqz v7, :cond_1e

    .line 459
    .line 460
    goto :goto_c

    .line 461
    :cond_1e
    iget-object v15, v3, Lt37;->h0:Lar3;

    .line 462
    .line 463
    goto :goto_f

    .line 464
    :cond_1f
    if-nez v8, :cond_20

    .line 465
    .line 466
    invoke-virtual {v0, v3, v12}, Lsp4;->p(Lt37;Ljava/lang/Object;)Lar3;

    .line 467
    .line 468
    .line 469
    move-result-object v15

    .line 470
    goto :goto_e

    .line 471
    :cond_20
    move-object v15, v8

    .line 472
    :goto_e
    if-eqz v5, :cond_21

    .line 473
    .line 474
    invoke-virtual {v15, v3, v12}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v16

    .line 478
    if-eqz v16, :cond_22

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_21
    if-eqz v6, :cond_22

    .line 482
    .line 483
    invoke-virtual {v6, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v16

    .line 487
    if-eqz v16, :cond_22

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_22
    :goto_f
    :try_start_4
    invoke-virtual {v14, v13, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v15, v12, v2, v3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 494
    .line 495
    .line 496
    goto :goto_c

    .line 497
    :catch_4
    move-exception v0

    .line 498
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-static {v3, v0, v1, v2}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    throw v9

    .line 506
    :cond_23
    invoke-virtual {v0, v3, v4}, Llj7;->l(Lt37;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    throw v9

    .line 510
    :cond_24
    return-void
.end method

.method public final t(Ljava/lang/Object;Z)Lsp4;
    .locals 2

    .line 1
    iget-object v0, p0, Lsp4;->p0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lsp4;->q0:Z

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "withContentInclusion"

    .line 11
    .line 12
    const-class v1, Lsp4;

    .line 13
    .line 14
    invoke-static {v1, p0, v0}, Lit0;->x(Ljava/lang/Class;Ljava/io/Serializable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lsp4;

    .line 18
    .line 19
    iget-object v1, p0, Lsp4;->k0:Lri8;

    .line 20
    .line 21
    invoke-direct {v0, p0, v1, p1, p2}, Lsp4;-><init>(Lsp4;Lri8;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
