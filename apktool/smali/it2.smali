.class public final Lit2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lni0;

.field public final b:Lht2;

.field public final c:Ljava/util/List;

.field public final d:Loh7;


# direct methods
.method public constructor <init>(Ls98;Lni0;Lhi0;Lkc4;Ljava/util/List;Ljg0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lit2;->a:Lni0;

    .line 17
    .line 18
    iget-object v0, p3, Lhi0;->k:Ljava/util/List;

    .line 19
    .line 20
    iput-object v0, p0, Lit2;->c:Ljava/util/List;

    .line 21
    .line 22
    iget-object v3, p3, Lhi0;->i:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v4, p3, Lhi0;->l:Ljava/util/Map;

    .line 25
    .line 26
    sget-object v0, Lsj0;->c:Lxu4;

    .line 27
    .line 28
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object p3, p3, Lhi0;->n:Lji0;

    .line 54
    .line 55
    iget-object p6, p6, Ljg0;->b:Ltl7;

    .line 56
    .line 57
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p3, p3, Lji0;->b:Lr75;

    .line 61
    .line 62
    sget-object p6, Ljg0;->c:Ljava/util/Map;

    .line 63
    .line 64
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {p6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p6

    .line 70
    check-cast p6, Ljava/util/Set;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    if-eqz p6, :cond_2

    .line 74
    .line 75
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {p6, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p6

    .line 81
    const/4 v1, 0x1

    .line 82
    if-ne p6, v1, :cond_2

    .line 83
    .line 84
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v1, 0x22

    .line 87
    .line 88
    if-ge p6, v1, :cond_2

    .line 89
    .line 90
    const/16 p6, 0xa

    .line 91
    .line 92
    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result p6

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move p6, v0

    .line 98
    :goto_0
    iget p3, p3, Lr75;->Y:I

    .line 99
    .line 100
    invoke-static {p6, p3}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    const/4 p6, 0x0

    .line 105
    if-eqz p3, :cond_3

    .line 106
    .line 107
    new-instance v1, Lan0;

    .line 108
    .line 109
    int-to-long v5, p3

    .line 110
    invoke-direct {v1, v5, v6}, Lan0;-><init>(J)V

    .line 111
    .line 112
    .line 113
    move-object p3, v1

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    move-object p3, p6

    .line 116
    :goto_1
    new-instance v1, Lht2;

    .line 117
    .line 118
    invoke-static {p3}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {p5, v2}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    filled-new-array {p4, p3}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p4

    .line 130
    invoke-static {p4}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    iget-object v7, p1, Ls98;->a:Lb71;

    .line 135
    .line 136
    iget-object v8, p1, Ls98;->h:Lu61;

    .line 137
    .line 138
    move-object v2, p2

    .line 139
    invoke-direct/range {v1 .. v8}, Lht2;-><init>(Lni0;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;Lb71;Lu61;)V

    .line 140
    .line 141
    .line 142
    iput-object v1, p0, Lit2;->b:Lht2;

    .line 143
    .line 144
    if-eqz p3, :cond_5

    .line 145
    .line 146
    iget-object p1, p3, Lan0;->Z:Lht2;

    .line 147
    .line 148
    if-nez p1, :cond_4

    .line 149
    .line 150
    iput-object v1, p3, Lan0;->Z:Lht2;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Lht2;->U(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lht2;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    const-string p0, "GraphLoop has already been set!"

    .line 160
    .line 161
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p6

    .line 165
    :cond_5
    :goto_2
    sget-object p1, Lot2;->b:Lot2;

    .line 166
    .line 167
    invoke-static {p1}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lit2;->d:Loh7;

    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final a(Lmt2;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lit2;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lmt2;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lit2;->d:Loh7;

    .line 8
    .line 9
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Lrt2;

    .line 15
    .line 16
    instance-of v3, v2, Lpt2;

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    instance-of v2, v2, Lot2;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v2, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    :goto_0
    sget-object v2, Lot2;->b:Lot2;

    .line 28
    .line 29
    :goto_1
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object p0, p0, Lit2;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lst2;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lst2;->a:Lok0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lst2;->a()Lqi0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v1, v0, p1}, Lok0;->b(Lqi0;Lrt2;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lit2;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lit2;->d:Loh7;

    .line 5
    .line 6
    sget-object v1, Lot2;->b:Lot2;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Loh7;->m(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lit2;->b:Lht2;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Lht2;->X(Lxm0;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lit2;->c:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lst2;

    .line 34
    .line 35
    iget-object v2, v0, Lst2;->a:Lok0;

    .line 36
    .line 37
    invoke-virtual {v0}, Lst2;->a()Lqi0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v2, v0, v1}, Lok0;->b(Lqi0;Lrt2;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public final c(Lne6;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lit2;->b:Lht2;

    .line 2
    .line 3
    iget-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lht2;->m0:Lne6;

    .line 7
    .line 8
    iput-object p1, p0, Lht2;->m0:Lne6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Lht2;->i0:Ly5;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    :try_start_1
    new-instance v2, Lzs2;

    .line 20
    .line 21
    invoke-direct {v2, p1}, Lzs2;-><init>(Lne6;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ly5;->g0(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    sget-object v2, Lvs2;->d:Lvs2;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ly5;->g0(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :goto_0
    monitor-exit v0

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 v0, 0x0

    .line 45
    :goto_1
    if-ge v0, p1, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ldt2;

    .line 54
    .line 55
    invoke-interface {v1}, Ldt2;->c()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    return-void

    .line 62
    :goto_2
    monitor-exit v0

    .line 63
    throw p0
.end method

.method public final d(Ljava/util/LinkedHashMap;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lit2;->b:Lht2;

    .line 2
    .line 3
    iget-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lht2;->i0:Ly5;

    .line 7
    .line 8
    new-instance v2, Lys2;

    .line 9
    .line 10
    iget-object p0, p0, Lht2;->n0:Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v2, p0, p1}, Lys2;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ly5;->g0(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit v0

    .line 22
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphProcessor(cameraGraph: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lit2;->a:Lni0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
