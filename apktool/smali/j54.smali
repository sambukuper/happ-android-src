.class public final Lj54;
.super Lv1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final o0:Lz47;

.field public final p0:Lhb6;


# direct methods
.method public constructor <init>(Lz47;Lhb6;ILed1;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc6;

    .line 4
    .line 5
    iget-object v0, v0, Lc6;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, v0

    .line 8
    check-cast v5, Lve4;

    .line 9
    .line 10
    new-instance v3, Ln44;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v3, p1, p2, v0}, Ln44;-><init>(Lz47;Lvj3;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, Lhb6;->a:Ljava/lang/reflect/TypeVariable;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    sget-object v7, Lrt8;->Z:Lrt8;

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    move-object v1, p0

    .line 30
    move v2, p3

    .line 31
    move-object v4, p4

    .line 32
    invoke-direct/range {v1 .. v8}, Lk3;-><init>(ILsm;Led1;Lve4;Lv15;Lrt8;Z)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v1, Lj54;->o0:Lz47;

    .line 36
    .line 37
    iput-object p2, v1, Lj54;->p0:Lhb6;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final H0(Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v3, p0, Lj54;->o0:Lz47;

    .line 2
    .line 3
    iget-object v0, v3, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v6, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    invoke-static {p1, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v7, v0

    .line 31
    check-cast v7, Lt14;

    .line 32
    .line 33
    sget-object v0, Lcd5;->D0:Lcd5;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    invoke-static {v7, v0, v8}, Lcj8;->c(Lt14;Lgn2;Lpc7;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    move-object v1, p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v0, Lg97;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    sget-object v4, Lkm;->h0:Lkm;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    move-object v1, p0

    .line 54
    invoke-direct/range {v0 .. v5}, Lg97;-><init>(Lzk;ZLz47;Lkm;Z)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Ld02;->X:Ld02;

    .line 58
    .line 59
    invoke-virtual {v0, v7, p0, v8, v2}, Lw39;->m(Lx14;Ljava/util/List;Lrh8;Z)Ld3;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v7}, Lt14;->q0()Lmo8;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0, p0, v2, v5}, Lk32;->e(Lmo8;Ld3;IZ)Lb8;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lt14;

    .line 74
    .line 75
    if-nez p0, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v7, p0

    .line 79
    :goto_1
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-object p0, v1

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-object v6
.end method

.method public final I0()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lj54;->p0:Lhb6;

    .line 2
    .line 3
    iget-object v0, v0, Lhb6;->a:Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v2, v0

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_0

    .line 22
    .line 23
    aget-object v5, v0, v4

    .line 24
    .line 25
    new-instance v6, Lva6;

    .line 26
    .line 27
    invoke-direct {v6, v5}, Lva6;-><init>(Ljava/lang/reflect/Type;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lwv0;->Q0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lva6;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, Lva6;->a:Ljava/lang/reflect/Type;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_1
    const-class v2, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v1, Ld02;->X:Ld02;

    .line 57
    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, Lj54;->o0:Lz47;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object p0, v2, Lz47;->Y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lc6;

    .line 69
    .line 70
    iget-object p0, p0, Lc6;->n0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lwx4;

    .line 73
    .line 74
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 75
    .line 76
    invoke-virtual {p0}, Lzz3;->e()Laa7;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object v0, v2, Lz47;->Y:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lc6;

    .line 83
    .line 84
    iget-object v0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lwx4;

    .line 87
    .line 88
    iget-object v0, v0, Lwx4;->h0:Lzz3;

    .line 89
    .line 90
    invoke-virtual {v0}, Lzz3;->p()Laa7;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p0, v0}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    const/16 v4, 0xa

    .line 106
    .line 107
    invoke-static {v1, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Lva6;

    .line 129
    .line 130
    iget-object v5, v2, Lz47;->g0:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v5, Lf63;

    .line 133
    .line 134
    sget-object v6, Lzi8;->Y:Lzi8;

    .line 135
    .line 136
    const/4 v7, 0x3

    .line 137
    invoke-static {v6, v3, p0, v7}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v5, v4, v6}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    return-object v0
.end method
