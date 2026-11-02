.class public Lf50;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld50;
.implements Ljava/io/Serializable;


# instance fields
.field public final X:Lix5;

.field public final Y:Lr37;

.field public final Z:Ljx5;

.field public final f0:Ldh8;

.field public final g0:Ldh8;

.field public h0:Ldh8;

.field public final i0:Lgl;

.field public final transient j0:Ljava/lang/reflect/Method;

.field public final transient k0:Ljava/lang/reflect/Field;

.field public l0:Lar3;

.field public m0:Lar3;

.field public n0:Lri8;

.field public transient o0:Lg33;

.field public final p0:Z

.field public final q0:Ljava/lang/Object;

.field public final r0:[Ljava/lang/Class;

.field public final transient s0:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Le50;Lgl;Ltm;Ldh8;Lar3;Lsi8;Ldh8;ZLjava/lang/Object;[Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Le50;->i()Lix5;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    sget-object p3, Lix5;->j0:Lix5;

    .line 11
    .line 12
    :cond_0
    iput-object p3, p0, Lf50;->X:Lix5;

    .line 13
    .line 14
    iput-object p2, p0, Lf50;->i0:Lgl;

    .line 15
    .line 16
    new-instance p3, Lr37;

    .line 17
    .line 18
    invoke-virtual {p1}, Le50;->j()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p3, v0}, Lr37;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lf50;->Y:Lr37;

    .line 26
    .line 27
    invoke-virtual {p1}, Le50;->n()V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lf50;->Z:Ljx5;

    .line 32
    .line 33
    iput-object p4, p0, Lf50;->f0:Ldh8;

    .line 34
    .line 35
    iput-object p5, p0, Lf50;->l0:Lar3;

    .line 36
    .line 37
    if-nez p5, :cond_1

    .line 38
    .line 39
    sget-object p3, Lpx5;->f:Lpx5;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object p3, p1

    .line 43
    :goto_0
    iput-object p3, p0, Lf50;->o0:Lg33;

    .line 44
    .line 45
    iput-object p6, p0, Lf50;->n0:Lri8;

    .line 46
    .line 47
    iput-object p7, p0, Lf50;->g0:Ldh8;

    .line 48
    .line 49
    instance-of p3, p2, Lel;

    .line 50
    .line 51
    if-eqz p3, :cond_2

    .line 52
    .line 53
    iput-object p1, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    check-cast p2, Lel;

    .line 56
    .line 57
    iget-object p2, p2, Lel;->D0:Ljava/lang/reflect/Field;

    .line 58
    .line 59
    iput-object p2, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    instance-of p3, p2, Lhl;

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    check-cast p2, Lhl;

    .line 67
    .line 68
    iget-object p2, p2, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    iput-object p2, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    iput-object p1, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iput-object p1, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 76
    .line 77
    iput-object p1, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 78
    .line 79
    :goto_1
    iput-boolean p8, p0, Lf50;->p0:Z

    .line 80
    .line 81
    iput-object p9, p0, Lf50;->q0:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object p1, p0, Lf50;->m0:Lar3;

    .line 84
    .line 85
    iput-object p10, p0, Lf50;->r0:[Ljava/lang/Class;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>(Lf50;)V
    .locals 1

    .line 130
    iget-object v0, p1, Lf50;->Y:Lr37;

    invoke-direct {p0, p1, v0}, Lf50;-><init>(Lf50;Lr37;)V

    return-void
.end method

.method public constructor <init>(Lf50;Ljx5;)V
    .locals 1

    const/4 v0, 0x0

    .line 88
    invoke-direct {p0, p1, v0}, Lf50;-><init>(Lf50;Z)V

    .line 89
    new-instance v0, Lr37;

    .line 90
    iget-object p2, p2, Ljx5;->X:Ljava/lang/String;

    .line 91
    invoke-direct {v0, p2}, Lr37;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lf50;->Y:Lr37;

    .line 92
    iget-object p2, p1, Lf50;->Z:Ljx5;

    iput-object p2, p0, Lf50;->Z:Ljx5;

    .line 93
    iget-object p2, p1, Lf50;->f0:Ldh8;

    iput-object p2, p0, Lf50;->f0:Ldh8;

    .line 94
    iget-object p2, p1, Lf50;->i0:Lgl;

    iput-object p2, p0, Lf50;->i0:Lgl;

    .line 95
    iget-object p2, p1, Lf50;->j0:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 96
    iget-object p2, p1, Lf50;->k0:Ljava/lang/reflect/Field;

    iput-object p2, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 97
    iget-object p2, p1, Lf50;->l0:Lar3;

    iput-object p2, p0, Lf50;->l0:Lar3;

    .line 98
    iget-object p2, p1, Lf50;->m0:Lar3;

    iput-object p2, p0, Lf50;->m0:Lar3;

    .line 99
    iget-object p2, p1, Lf50;->s0:Ljava/util/HashMap;

    if-eqz p2, :cond_0

    .line 100
    new-instance p2, Ljava/util/HashMap;

    iget-object v0, p1, Lf50;->s0:Ljava/util/HashMap;

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lf50;->s0:Ljava/util/HashMap;

    .line 101
    :cond_0
    iget-object p2, p1, Lf50;->g0:Ldh8;

    iput-object p2, p0, Lf50;->g0:Ldh8;

    .line 102
    sget-object p2, Lpx5;->f:Lpx5;

    .line 103
    iput-object p2, p0, Lf50;->o0:Lg33;

    .line 104
    iget-boolean p2, p1, Lf50;->p0:Z

    iput-boolean p2, p0, Lf50;->p0:Z

    .line 105
    iget-object p2, p1, Lf50;->q0:Ljava/lang/Object;

    iput-object p2, p0, Lf50;->q0:Ljava/lang/Object;

    .line 106
    iget-object p2, p1, Lf50;->r0:[Ljava/lang/Class;

    iput-object p2, p0, Lf50;->r0:[Ljava/lang/Class;

    .line 107
    iget-object p2, p1, Lf50;->n0:Lri8;

    iput-object p2, p0, Lf50;->n0:Lri8;

    .line 108
    iget-object p1, p1, Lf50;->h0:Ldh8;

    iput-object p1, p0, Lf50;->h0:Ldh8;

    return-void
.end method

.method public constructor <init>(Lf50;Lr37;)V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, p1, v0}, Lf50;-><init>(Lf50;Z)V

    .line 110
    iput-object p2, p0, Lf50;->Y:Lr37;

    .line 111
    iget-object p2, p1, Lf50;->Z:Ljx5;

    iput-object p2, p0, Lf50;->Z:Ljx5;

    .line 112
    iget-object p2, p1, Lf50;->i0:Lgl;

    iput-object p2, p0, Lf50;->i0:Lgl;

    .line 113
    iget-object p2, p1, Lf50;->f0:Ldh8;

    iput-object p2, p0, Lf50;->f0:Ldh8;

    .line 114
    iget-object p2, p1, Lf50;->j0:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 115
    iget-object p2, p1, Lf50;->k0:Ljava/lang/reflect/Field;

    iput-object p2, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 116
    iget-object p2, p1, Lf50;->l0:Lar3;

    iput-object p2, p0, Lf50;->l0:Lar3;

    .line 117
    iget-object p2, p1, Lf50;->m0:Lar3;

    iput-object p2, p0, Lf50;->m0:Lar3;

    .line 118
    iget-object p2, p1, Lf50;->s0:Ljava/util/HashMap;

    if-eqz p2, :cond_0

    .line 119
    new-instance p2, Ljava/util/HashMap;

    iget-object v0, p1, Lf50;->s0:Ljava/util/HashMap;

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lf50;->s0:Ljava/util/HashMap;

    .line 120
    :cond_0
    iget-object p2, p1, Lf50;->g0:Ldh8;

    iput-object p2, p0, Lf50;->g0:Ldh8;

    .line 121
    sget-object p2, Lpx5;->f:Lpx5;

    .line 122
    iput-object p2, p0, Lf50;->o0:Lg33;

    .line 123
    iget-boolean p2, p1, Lf50;->p0:Z

    iput-boolean p2, p0, Lf50;->p0:Z

    .line 124
    iget-object p2, p1, Lf50;->q0:Ljava/lang/Object;

    iput-object p2, p0, Lf50;->q0:Ljava/lang/Object;

    .line 125
    iget-object p2, p1, Lf50;->r0:[Ljava/lang/Class;

    iput-object p2, p0, Lf50;->r0:[Ljava/lang/Class;

    .line 126
    iget-object p2, p1, Lf50;->n0:Lri8;

    iput-object p2, p0, Lf50;->n0:Lri8;

    .line 127
    iget-object p1, p1, Lf50;->h0:Ldh8;

    iput-object p1, p0, Lf50;->h0:Ldh8;

    return-void
.end method

.method public constructor <init>(Lf50;Z)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iget-object p1, p1, Lf50;->X:Lix5;

    iput-object p1, p0, Lf50;->X:Lix5;

    return-void
.end method


# virtual methods
.method public a(Lg33;Ljava/lang/Class;Lt37;)Lar3;
    .locals 2

    .line 1
    iget-object v0, p0, Lf50;->h0:Ldh8;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3, v0, p2}, Lt37;->e(Ldh8;Ljava/lang/Class;)Ldh8;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p2, p0}, Lt37;->m(Ldh8;Ld50;)Lar3;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    new-instance v0, Lzz2;

    .line 19
    .line 20
    iget-object p2, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3}, Lg33;->J(Ljava/lang/Class;Lar3;)Lg33;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {v0, p3, p2, v1}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p2, p0}, Lt37;->n(Ljava/lang/Class;Ld50;)Lar3;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    new-instance v0, Lzz2;

    .line 38
    .line 39
    invoke-virtual {p1, p2, p3}, Lg33;->J(Ljava/lang/Class;Lar3;)Lg33;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {v0, p3, p2, v1}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object p2, v0, Lzz2;->Z:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Lg33;

    .line 49
    .line 50
    if-eq p1, p2, :cond_1

    .line 51
    .line 52
    iput-object p2, p0, Lf50;->o0:Lg33;

    .line 53
    .line 54
    :cond_1
    iget-object p0, v0, Lzz2;->Y:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lar3;

    .line 57
    .line 58
    return-object p0
.end method

.method public final b()Lgl;
    .locals 0

    .line 1
    iget-object p0, p0, Lf50;->i0:Lgl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Lvp4;Ljava/lang/Class;)Lno3;
    .locals 0

    .line 1
    move-object p2, p1

    .line 2
    check-cast p2, Lwp4;

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p2, Lno3;->k0:Lno3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0}, Ld50;->b()Lgl;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lm85;->h(Lvj8;)Lno3;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    if-nez p2, :cond_2

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    sget-object p0, Ld50;->a:Lno3;

    .line 30
    .line 31
    :cond_1
    return-object p0

    .line 32
    :cond_2
    if-nez p0, :cond_3

    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_3
    invoke-virtual {p2, p0}, Lno3;->c(Lno3;)Lno3;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final d(Ljava/lang/Object;Lro3;Lt37;Lar3;)Z
    .locals 5

    .line 1
    invoke-virtual {p4}, Lar3;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    sget-object v0, Ln37;->h0:Ln37;

    .line 9
    .line 10
    iget-object v2, p3, Lt37;->X:Ll37;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ll37;->j(Ln37;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    iget-object v4, p0, Lf50;->Y:Lr37;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    instance-of p4, p4, Lh50;

    .line 23
    .line 24
    if-eqz p4, :cond_1

    .line 25
    .line 26
    instance-of p1, p1, Ljava/lang/Throwable;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lf50;->i0:Lgl;

    .line 31
    .line 32
    instance-of p1, p1, Lel;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const-string p1, "cause"

    .line 37
    .line 38
    iget-object p4, v4, Lr37;->X:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    move p1, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string p0, "Direct self-reference leading to cycle"

    .line 49
    .line 50
    invoke-virtual {p3, p0}, Lt37;->A(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    throw v2

    .line 54
    :cond_1
    move p1, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    sget-object p1, Ln37;->k0:Ln37;

    .line 57
    .line 58
    iget-object p4, p3, Lt37;->X:Ll37;

    .line 59
    .line 60
    invoke-virtual {p4, p1}, Ll37;->j(Ln37;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    :goto_0
    if-eqz p1, :cond_5

    .line 65
    .line 66
    iget-object p1, p0, Lf50;->m0:Lar3;

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    move-object p1, p2

    .line 71
    check-cast p1, Leq2;

    .line 72
    .line 73
    iget-object p1, p1, Leq2;->h0:Lfs3;

    .line 74
    .line 75
    iget-byte p1, p1, Lfs3;->a:B

    .line 76
    .line 77
    if-ne p1, v3, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2, v4}, Lro3;->R(Lr37;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    iget-object p0, p0, Lf50;->m0:Lar3;

    .line 84
    .line 85
    invoke-virtual {p0, v2, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return v3

    .line 89
    :cond_5
    return v1
.end method

.method public final e(Lvp4;Ljava/lang/Class;)Lep3;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0}, Ld50;->b()Lgl;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lep3;->g0:Lep3;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lvj8;->N()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p2, Lep3;->g0:Lep3;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lm85;->x(Lvj8;)Lep3;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p2, p0}, Lep3;->a(Lep3;)Lep3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public f(Lar3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf50;->m0:Lar3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v0}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "Cannot override _nullSerializer: had a "

    .line 17
    .line 18
    const-string v1, ", trying to set to "

    .line 19
    .line 20
    invoke-static {v0, p0, v1, p1}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    iput-object p1, p0, Lf50;->m0:Lar3;

    .line 29
    .line 30
    return-void
.end method

.method public g(Lar3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf50;->l0:Lar3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v0}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "Cannot override _serializer: had a "

    .line 17
    .line 18
    const-string v1, ", trying to set to "

    .line 19
    .line 20
    invoke-static {v0, p0, v1, p1}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    iput-object p1, p0, Lf50;->l0:Lar3;

    .line 29
    .line 30
    return-void
.end method

.method public h(Ll37;)V
    .locals 1

    .line 1
    sget-object v0, Lxp4;->r0:Lxp4;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Lf50;->i0:Lgl;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lit0;->d(Ljava/lang/reflect/Member;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public i(Lc25;)Lf50;
    .locals 2

    .line 1
    iget-object v0, p0, Lf50;->Y:Lr37;

    .line 2
    .line 3
    iget-object v1, v0, Lr37;->X:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lc25;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, v0, Lr37;->X:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {p1}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Lf50;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lf50;-><init>(Lf50;Ljx5;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public j(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    if-nez v1, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lf50;->m0:Lar3;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p2}, Lro3;->X()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object v0, p0, Lf50;->l0:Lar3;

    .line 32
    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, Lf50;->o0:Lg33;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lg33;->R(Ljava/lang/Class;)Lar3;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v2, v0, p3}, Lf50;->a(Lg33;Ljava/lang/Class;Lt37;)Lar3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v0, v3

    .line 53
    :cond_4
    :goto_1
    iget-object v2, p0, Lf50;->q0:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    sget-object v3, Ldp3;->Z:Ldp3;

    .line 58
    .line 59
    if-ne v3, v2, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p3, v1}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    invoke-virtual {p0, p2, p3}, Lf50;->l(Lro3;Lt37;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0, p2, p3}, Lf50;->l(Lro3;Lt37;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    if-ne v1, p1, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2, p3, v0}, Lf50;->d(Ljava/lang/Object;Lro3;Lt37;Lar3;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_7

    .line 88
    .line 89
    return-void

    .line 90
    :cond_7
    iget-object p0, p0, Lf50;->n0:Lri8;

    .line 91
    .line 92
    if-nez p0, :cond_8

    .line 93
    .line 94
    invoke-virtual {v0, v1, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_8
    invoke-virtual {v0, v1, p2, p3, p0}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public k(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    iget-object v2, p0, Lf50;->Y:Lr37;

    .line 18
    .line 19
    iget-object v3, p0, Lf50;->q0:Ljava/lang/Object;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {p3, v3}, Lt37;->x(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget-object p1, p0, Lf50;->m0:Lar3;

    .line 33
    .line 34
    if-eqz p1, :cond_7

    .line 35
    .line 36
    invoke-virtual {p2, v2}, Lro3;->R(Lr37;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lf50;->m0:Lar3;

    .line 40
    .line 41
    invoke-virtual {p0, v0, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v0, p0, Lf50;->l0:Lar3;

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v4, p0, Lf50;->o0:Lg33;

    .line 54
    .line 55
    invoke-virtual {v4, v0}, Lg33;->R(Ljava/lang/Class;)Lar3;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, v4, v0, p3}, Lf50;->a(Lg33;Ljava/lang/Class;Lt37;)Lar3;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move-object v0, v5

    .line 67
    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 68
    .line 69
    sget-object v4, Ldp3;->Z:Ldp3;

    .line 70
    .line 71
    if-ne v4, v3, :cond_5

    .line 72
    .line 73
    invoke-virtual {v0, p3, v1}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    if-ne v1, p1, :cond_8

    .line 88
    .line 89
    invoke-virtual {p0, p1, p2, p3, v0}, Lf50;->d(Ljava/lang/Object;Lro3;Lt37;Lar3;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_8

    .line 94
    .line 95
    :cond_7
    :goto_2
    return-void

    .line 96
    :cond_8
    invoke-virtual {p2, v2}, Lro3;->R(Lr37;)V

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Lf50;->n0:Lri8;

    .line 100
    .line 101
    if-nez p0, :cond_9

    .line 102
    .line 103
    invoke-virtual {v0, v1, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_9
    invoke-virtual {v0, v1, p2, p3, p0}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final l(Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lf50;->m0:Lar3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1, p2}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Lro3;->X()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "property \'"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lf50;->Y:Lr37;

    .line 14
    .line 15
    iget-object v1, v1, Lr37;->X:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "\' ("

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "#"

    .line 26
    .line 27
    iget-object v2, p0, Lf50;->j0:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const-string v3, "via method "

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v2, p0, Lf50;->k0:Ljava/lang/reflect/Field;

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    const-string v3, "field \""

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const-string v1, "virtual"

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :goto_0
    iget-object v1, p0, Lf50;->l0:Lar3;

    .line 95
    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    const-string p0, ", no static serializer"

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    iget-object p0, p0, Lf50;->l0:Lar3;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const-string v1, ", static serializer of type "

    .line 115
    .line 116
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :goto_1
    const/16 p0, 0x29

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method
