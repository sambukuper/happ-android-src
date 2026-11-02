.class public final Lxm0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lki8;


# instance fields
.field public final synthetic X:B

.field public Y:I

.field public final Z:Ljava/lang/Object;

.field public final f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public final h0:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lxm0;->X:B

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 93
    invoke-static {}, Lk05;->j()Lk05;

    move-result-object v0

    iput-object v0, p0, Lxm0;->g0:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 94
    iput v0, p0, Lxm0;->Y:I

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 96
    invoke-static {}, La15;->a()La15;

    move-result-object v0

    iput-object v0, p0, Lxm0;->h0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsf0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lxm0;->X:B

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 84
    sget-object p1, Ljt2;->a:Lqv;

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    sget-object v0, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    move-result p1

    .line 87
    iput p1, p0, Lxm0;->Y:I

    const/4 p1, 0x0

    .line 88
    invoke-static {p1}, Lnr4;->e(Z)Lpv;

    move-result-object p1

    iput-object p1, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 90
    new-instance p1, Lvk1;

    const/16 v0, 0xe

    invoke-direct {p1, p0, v0}, Lvk1;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, Lxm0;->h0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz47;Led1;Lpl3;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lxm0;->X:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 16
    .line 17
    iput p4, p0, Lxm0;->Y:I

    .line 18
    .line 19
    invoke-interface {p3}, Lpl3;->getTypeParameters()Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p3, 0x0

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-eqz p4, :cond_0

    .line 38
    .line 39
    add-int/lit8 p4, p3, 0x1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move p3, p4

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iput-object p2, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p1, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lz47;

    .line 59
    .line 60
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lc6;

    .line 63
    .line 64
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lve4;

    .line 67
    .line 68
    new-instance p2, Lf0;

    .line 69
    .line 70
    const/16 p3, 0x16

    .line 71
    .line 72
    invoke-direct {p2, p0, p3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lve4;->c(Lgn2;)Lvt1;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lxm0;->h0:Ljava/lang/Object;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public M(Lhb6;)Lhi8;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxm0;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lvt1;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lj54;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object p0, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lz47;

    .line 20
    .line 21
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lki8;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lki8;->M(Lhb6;)Lhi8;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lqf0;

    .line 37
    .line 38
    const-string v2, "InvokeInternalListeners"

    .line 39
    .line 40
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v1, Lqf0;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    move v4, v3

    .line 51
    :goto_1
    if-ge v4, v2, :cond_1

    .line 52
    .line 53
    iget-object v5, v1, Lqf0;->d:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lte6;

    .line 60
    .line 61
    iget-object v6, v1, Lqf0;->e:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    move v7, v3

    .line 68
    :goto_2
    if-ge v7, v6, :cond_0

    .line 69
    .line 70
    iget-object v8, v1, Lqf0;->e:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lme6;

    .line 77
    .line 78
    invoke-interface {v5}, Lte6;->getRequest()Lne6;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-interface {v8, v9}, Lme6;->a0(Lne6;)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 92
    .line 93
    .line 94
    const-string v2, "InvokeRequestListeners"

    .line 95
    .line 96
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, Lqf0;->d:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    move v4, v3

    .line 106
    :goto_3
    if-ge v4, v2, :cond_3

    .line 107
    .line 108
    iget-object v5, v1, Lqf0;->d:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Lte6;

    .line 115
    .line 116
    invoke-interface {v5}, Lte6;->getRequest()Lne6;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v6, v6, Lne6;->d:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    move v7, v3

    .line 127
    :goto_4
    if-ge v7, v6, :cond_2

    .line 128
    .line 129
    invoke-interface {v5}, Lte6;->getRequest()Lne6;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    iget-object v8, v8, Lne6;->d:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    check-cast v8, Lme6;

    .line 140
    .line 141
    invoke-interface {v5}, Lte6;->getRequest()Lne6;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-interface {v8, v9}, Lme6;->a0(Lne6;)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_4
    iget-object p0, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, Lsf0;

    .line 162
    .line 163
    iget-object v0, p0, Lsf0;->i:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v0

    .line 166
    :try_start_1
    invoke-virtual {p0}, Lsf0;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, Lsf0;->a:Lgh0;

    .line 170
    .line 171
    invoke-interface {p0}, Lgh0;->b0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    .line 173
    .line 174
    monitor-exit v0

    .line 175
    return-void

    .line 176
    :catchall_0
    move-exception p0

    .line 177
    monitor-exit v0

    .line 178
    throw p0

    .line 179
    :catchall_1
    move-exception p0

    .line 180
    monitor-exit v0

    .line 181
    throw p0
.end method

.method public b(Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lxg0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lxm0;->c(Lxg0;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public c(Lxg0;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public d(Ll11;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ll11;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lzx;

    .line 20
    .line 21
    iget-object v2, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lk05;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v1, v3}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v1}, Ll11;->d(Lzx;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lk05;

    .line 36
    .line 37
    invoke-interface {p1, v1}, Ll11;->i(Lzx;)Lk11;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v1, v4, v2}, Lk05;->l(Lzx;Lk11;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public e()Lym0;
    .locals 9

    .line 1
    new-instance v0, Lym0;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lk05;

    .line 15
    .line 16
    invoke-static {v2}, Lqd5;->c(Ll11;)Lqd5;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget v3, p0, Lxm0;->Y:I

    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v5, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lxm0;->h0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La15;

    .line 34
    .line 35
    sget-object v5, Ld18;->b:Ld18;

    .line 36
    .line 37
    new-instance v5, Landroid/util/ArrayMap;

    .line 38
    .line 39
    invoke-direct {v5}, Landroid/util/ArrayMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Ld18;->a:Landroid/util/ArrayMap;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p0, v7}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v5, v7, v8}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p0, Ld18;

    .line 73
    .line 74
    invoke-direct {p0, v5}, Ld18;-><init>(Landroid/util/ArrayMap;)V

    .line 75
    .line 76
    .line 77
    move-object v5, p0

    .line 78
    invoke-direct/range {v0 .. v5}, Lym0;-><init>(Ljava/util/ArrayList;Lqd5;ILjava/util/ArrayList;Ld18;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public f()Ldn8;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lpv;

    .line 7
    .line 8
    invoke-virtual {v0}, Lpv;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lsf0;

    .line 19
    .line 20
    invoke-virtual {p0}, Lsf0;->b()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v1
.end method

.method public g(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z
    .locals 11

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lpv;

    .line 13
    .line 14
    invoke-virtual {v0}, Lpv;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    const-string v0, "CXCP#buildCaptureSequence"

    .line 29
    .line 30
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Lsf0;

    .line 37
    .line 38
    iget-object v0, p0, Lxm0;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v8, v0

    .line 41
    check-cast v8, Lvk1;

    .line 42
    .line 43
    move v3, p1

    .line 44
    move-object v4, p2

    .line 45
    move-object v5, p3

    .line 46
    move-object v6, p4

    .line 47
    move-object/from16 v7, p5

    .line 48
    .line 49
    move-object/from16 v9, p6

    .line 50
    .line 51
    invoke-virtual/range {v2 .. v9}, Lsf0;->a(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lvk1;Ljava/util/List;)Lqf0;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, Lne6;

    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    return v1

    .line 94
    :cond_3
    iget-object p3, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p3, Lpv;

    .line 97
    .line 98
    invoke-virtual {p3}, Lpv;->b()Z

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-eqz p3, :cond_4

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    return v1

    .line 111
    :cond_4
    iget-boolean p2, p1, Lqf0;->b:Z

    .line 112
    .line 113
    if-nez p2, :cond_5

    .line 114
    .line 115
    iget-object p2, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, Ljava/util/ArrayList;

    .line 118
    .line 119
    monitor-enter p2

    .line 120
    :try_start_1
    iget-object p3, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p3, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    monitor-exit p2

    .line 128
    goto :goto_2

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    move-object p0, v0

    .line 131
    monitor-exit p2

    .line 132
    throw p0

    .line 133
    :cond_5
    :goto_2
    :try_start_2
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lqf0;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    const-string p2, "InvokeInternalListeners"

    .line 140
    .line 141
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object p2, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    move p3, v1

    .line 151
    :goto_3
    if-ge p3, p2, :cond_7

    .line 152
    .line 153
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    check-cast p4, Lte6;

    .line 160
    .line 161
    iget-object v0, p1, Lqf0;->e:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    move v2, v1

    .line 168
    :goto_4
    if-ge v2, v0, :cond_6

    .line 169
    .line 170
    iget-object v3, p1, Lqf0;->e:Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lme6;

    .line 177
    .line 178
    invoke-interface {v3, p4}, Lme6;->m(Lte6;)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    move-object p2, v0

    .line 186
    move p3, v1

    .line 187
    goto/16 :goto_18

    .line 188
    .line 189
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 193
    .line 194
    .line 195
    const-string p2, "InvokeRequestListeners"

    .line 196
    .line 197
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    move p3, v1

    .line 207
    :goto_5
    if-ge p3, p2, :cond_9

    .line 208
    .line 209
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p4

    .line 215
    check-cast p4, Lte6;

    .line 216
    .line 217
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v0, v0, Lne6;->d:Ljava/util/List;

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    move v2, v1

    .line 228
    :goto_6
    if-ge v2, v0, :cond_8

    .line 229
    .line 230
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v3, v3, Lne6;->d:Ljava/util/List;

    .line 235
    .line 236
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Lme6;

    .line 241
    .line 242
    invoke-interface {v3, p4}, Lme6;->m(Lte6;)V

    .line 243
    .line 244
    .line 245
    add-int/lit8 v2, v2, 0x1

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_8
    add-int/lit8 p3, p3, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 252
    .line 253
    .line 254
    monitor-enter p1
    :try_end_2
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 255
    :try_start_3
    iget-object p2, p0, Lxm0;->g0:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p2, Lpv;

    .line 258
    .line 259
    invoke-virtual {p2}, Lpv;->b()Z

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    if-eqz p2, :cond_e

    .line 264
    .line 265
    invoke-virtual {p1}, Lqf0;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 269
    .line 270
    .line 271
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 272
    iget-boolean p2, p1, Lqf0;->b:Z

    .line 273
    .line 274
    if-nez p2, :cond_23

    .line 275
    .line 276
    iget-object p2, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p2, Ljava/util/ArrayList;

    .line 279
    .line 280
    monitor-enter p2

    .line 281
    iget-object p0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p0, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    monitor-exit p2

    .line 289
    const-string p0, "InvokeInternalListeners"

    .line 290
    .line 291
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    move p2, v1

    .line 301
    :goto_7
    if-ge p2, p0, :cond_b

    .line 302
    .line 303
    iget-object p3, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p3

    .line 309
    check-cast p3, Lte6;

    .line 310
    .line 311
    iget-object p4, p1, Lqf0;->e:Ljava/util/List;

    .line 312
    .line 313
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 314
    .line 315
    .line 316
    move-result p4

    .line 317
    move v0, v1

    .line 318
    :goto_8
    if-ge v0, p4, :cond_a

    .line 319
    .line 320
    iget-object v2, p1, Lqf0;->e:Ljava/util/List;

    .line 321
    .line 322
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, Lme6;

    .line 327
    .line 328
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-interface {v2, v3}, Lme6;->a0(Lne6;)V

    .line 333
    .line 334
    .line 335
    add-int/lit8 v0, v0, 0x1

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_a
    add-int/lit8 p2, p2, 0x1

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 342
    .line 343
    .line 344
    const-string p0, "InvokeRequestListeners"

    .line 345
    .line 346
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    move p2, v1

    .line 356
    :goto_9
    if-ge p2, p0, :cond_d

    .line 357
    .line 358
    iget-object p3, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p3

    .line 364
    check-cast p3, Lte6;

    .line 365
    .line 366
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 367
    .line 368
    .line 369
    move-result-object p4

    .line 370
    iget-object p4, p4, Lne6;->d:Ljava/util/List;

    .line 371
    .line 372
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 373
    .line 374
    .line 375
    move-result p4

    .line 376
    move v0, v1

    .line 377
    :goto_a
    if-ge v0, p4, :cond_c

    .line 378
    .line 379
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    iget-object v2, v2, Lne6;->d:Ljava/util/List;

    .line 384
    .line 385
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    check-cast v2, Lme6;

    .line 390
    .line 391
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-interface {v2, v3}, Lme6;->a0(Lne6;)V

    .line 396
    .line 397
    .line 398
    add-int/lit8 v0, v0, 0x1

    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_c
    add-int/lit8 p2, p2, 0x1

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 405
    .line 406
    .line 407
    return v1

    .line 408
    :catchall_2
    move-exception v0

    .line 409
    move-object p2, v0

    .line 410
    goto/16 :goto_17

    .line 411
    .line 412
    :cond_e
    :try_start_5
    const-string p2, "CXCP#submit(CaptureSequence)"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 413
    .line 414
    :try_start_6
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    iget-object p2, p0, Lxm0;->f0:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast p2, Lsf0;

    .line 420
    .line 421
    invoke-virtual {p2, p1}, Lsf0;->c(Lqf0;)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    const/4 p3, -0x1

    .line 426
    if-eqz p2, :cond_f

    .line 427
    .line 428
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    goto :goto_b

    .line 433
    :catchall_3
    move-exception v0

    .line 434
    move-object p2, v0

    .line 435
    goto/16 :goto_16

    .line 436
    .line 437
    :cond_f
    move p2, p3

    .line 438
    :goto_b
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object p4

    .line 442
    iput-object p4, p1, Lqf0;->m:Ljava/lang/Integer;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 443
    .line 444
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 445
    .line 446
    .line 447
    :try_start_8
    monitor-exit p1

    .line 448
    if-eq p2, p3, :cond_14

    .line 449
    .line 450
    const-string p2, "InvokeInternalListeners"

    .line 451
    .line 452
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    iget-object p2, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 458
    .line 459
    .line 460
    move-result p2

    .line 461
    move p3, v1

    .line 462
    :goto_c
    if-ge p3, p2, :cond_11

    .line 463
    .line 464
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object p4

    .line 470
    check-cast p4, Lte6;

    .line 471
    .line 472
    iget-object v0, p1, Lqf0;->e:Ljava/util/List;

    .line 473
    .line 474
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    move v2, v1

    .line 479
    :goto_d
    if-ge v2, v0, :cond_10

    .line 480
    .line 481
    iget-object v3, p1, Lqf0;->e:Ljava/util/List;

    .line 482
    .line 483
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lme6;

    .line 488
    .line 489
    invoke-interface {v3, p4}, Lme6;->R(Lte6;)V

    .line 490
    .line 491
    .line 492
    add-int/lit8 v2, v2, 0x1

    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_10
    add-int/lit8 p3, p3, 0x1

    .line 496
    .line 497
    goto :goto_c

    .line 498
    :cond_11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 499
    .line 500
    .line 501
    const-string p2, "InvokeRequestListeners"

    .line 502
    .line 503
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    iget-object p2, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result p2

    .line 512
    move p3, v1

    .line 513
    :goto_e
    if-ge p3, p2, :cond_13

    .line 514
    .line 515
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p4

    .line 521
    check-cast p4, Lte6;

    .line 522
    .line 523
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iget-object v0, v0, Lne6;->d:Ljava/util/List;

    .line 528
    .line 529
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    move v2, v1

    .line 534
    :goto_f
    if-ge v2, v0, :cond_12

    .line 535
    .line 536
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    iget-object v3, v3, Lne6;->d:Ljava/util/List;

    .line 541
    .line 542
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, Lme6;

    .line 547
    .line 548
    invoke-interface {v3, p4}, Lme6;->R(Lte6;)V

    .line 549
    .line 550
    .line 551
    add-int/lit8 v2, v2, 0x1

    .line 552
    .line 553
    goto :goto_f

    .line 554
    :cond_12
    add-int/lit8 p3, p3, 0x1

    .line 555
    .line 556
    goto :goto_e

    .line 557
    :cond_13
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 558
    .line 559
    .line 560
    const/4 p2, 0x1

    .line 561
    :try_start_9
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    invoke-virtual {p1}, Lqf0;->toString()Ljava/lang/String;
    :try_end_9
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 565
    .line 566
    .line 567
    :goto_10
    move p3, p2

    .line 568
    goto :goto_11

    .line 569
    :catchall_4
    move-exception v0

    .line 570
    move-object p3, v0

    .line 571
    move-object v10, p3

    .line 572
    move p3, p2

    .line 573
    move-object p2, v10

    .line 574
    goto/16 :goto_18

    .line 575
    .line 576
    :cond_14
    :try_start_a
    invoke-virtual {p1}, Lqf0;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    invoke-virtual {p0}, Lxm0;->toString()Ljava/lang/String;
    :try_end_a
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 580
    .line 581
    .line 582
    move p2, v1

    .line 583
    goto :goto_10

    .line 584
    :goto_11
    if-nez p3, :cond_19

    .line 585
    .line 586
    iget-boolean p3, p1, Lqf0;->b:Z

    .line 587
    .line 588
    if-nez p3, :cond_19

    .line 589
    .line 590
    iget-object p3, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast p3, Ljava/util/ArrayList;

    .line 593
    .line 594
    monitor-enter p3

    .line 595
    :try_start_b
    iget-object p0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast p0, Ljava/util/ArrayList;

    .line 598
    .line 599
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 600
    .line 601
    .line 602
    monitor-exit p3

    .line 603
    const-string p0, "InvokeInternalListeners"

    .line 604
    .line 605
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 609
    .line 610
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 611
    .line 612
    .line 613
    move-result p0

    .line 614
    move p3, v1

    .line 615
    :goto_12
    if-ge p3, p0, :cond_16

    .line 616
    .line 617
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 618
    .line 619
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p4

    .line 623
    check-cast p4, Lte6;

    .line 624
    .line 625
    iget-object v0, p1, Lqf0;->e:Ljava/util/List;

    .line 626
    .line 627
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    move v2, v1

    .line 632
    :goto_13
    if-ge v2, v0, :cond_15

    .line 633
    .line 634
    iget-object v3, p1, Lqf0;->e:Ljava/util/List;

    .line 635
    .line 636
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    check-cast v3, Lme6;

    .line 641
    .line 642
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    invoke-interface {v3, v4}, Lme6;->a0(Lne6;)V

    .line 647
    .line 648
    .line 649
    add-int/lit8 v2, v2, 0x1

    .line 650
    .line 651
    goto :goto_13

    .line 652
    :cond_15
    add-int/lit8 p3, p3, 0x1

    .line 653
    .line 654
    goto :goto_12

    .line 655
    :cond_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 656
    .line 657
    .line 658
    const-string p0, "InvokeRequestListeners"

    .line 659
    .line 660
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 664
    .line 665
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 666
    .line 667
    .line 668
    move-result p0

    .line 669
    move p3, v1

    .line 670
    :goto_14
    if-ge p3, p0, :cond_18

    .line 671
    .line 672
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 673
    .line 674
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object p4

    .line 678
    check-cast p4, Lte6;

    .line 679
    .line 680
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    iget-object v0, v0, Lne6;->d:Ljava/util/List;

    .line 685
    .line 686
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    move v2, v1

    .line 691
    :goto_15
    if-ge v2, v0, :cond_17

    .line 692
    .line 693
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    iget-object v3, v3, Lne6;->d:Ljava/util/List;

    .line 698
    .line 699
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    check-cast v3, Lme6;

    .line 704
    .line 705
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    invoke-interface {v3, v4}, Lme6;->a0(Lne6;)V

    .line 710
    .line 711
    .line 712
    add-int/lit8 v2, v2, 0x1

    .line 713
    .line 714
    goto :goto_15

    .line 715
    :cond_17
    add-int/lit8 p3, p3, 0x1

    .line 716
    .line 717
    goto :goto_14

    .line 718
    :cond_18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 719
    .line 720
    .line 721
    return p2

    .line 722
    :catchall_5
    move-exception v0

    .line 723
    move-object p0, v0

    .line 724
    monitor-exit p3

    .line 725
    throw p0

    .line 726
    :cond_19
    return p2

    .line 727
    :goto_16
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 728
    .line 729
    .line 730
    throw p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 731
    :goto_17
    :try_start_d
    monitor-exit p1

    .line 732
    throw p2
    :try_end_d
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 733
    :goto_18
    if-nez p3, :cond_1e

    .line 734
    .line 735
    iget-boolean p3, p1, Lqf0;->b:Z

    .line 736
    .line 737
    if-nez p3, :cond_1e

    .line 738
    .line 739
    iget-object p3, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast p3, Ljava/util/ArrayList;

    .line 742
    .line 743
    monitor-enter p3

    .line 744
    :try_start_e
    iget-object p0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast p0, Ljava/util/ArrayList;

    .line 747
    .line 748
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 749
    .line 750
    .line 751
    monitor-exit p3

    .line 752
    const-string p0, "InvokeInternalListeners"

    .line 753
    .line 754
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 758
    .line 759
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 760
    .line 761
    .line 762
    move-result p0

    .line 763
    move p3, v1

    .line 764
    :goto_19
    if-ge p3, p0, :cond_1b

    .line 765
    .line 766
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 767
    .line 768
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object p4

    .line 772
    check-cast p4, Lte6;

    .line 773
    .line 774
    iget-object v0, p1, Lqf0;->e:Ljava/util/List;

    .line 775
    .line 776
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    move v2, v1

    .line 781
    :goto_1a
    if-ge v2, v0, :cond_1a

    .line 782
    .line 783
    iget-object v3, p1, Lqf0;->e:Ljava/util/List;

    .line 784
    .line 785
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    check-cast v3, Lme6;

    .line 790
    .line 791
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    invoke-interface {v3, v4}, Lme6;->a0(Lne6;)V

    .line 796
    .line 797
    .line 798
    add-int/lit8 v2, v2, 0x1

    .line 799
    .line 800
    goto :goto_1a

    .line 801
    :cond_1a
    add-int/lit8 p3, p3, 0x1

    .line 802
    .line 803
    goto :goto_19

    .line 804
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 805
    .line 806
    .line 807
    const-string p0, "InvokeRequestListeners"

    .line 808
    .line 809
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 815
    .line 816
    .line 817
    move-result p0

    .line 818
    move p3, v1

    .line 819
    :goto_1b
    if-ge p3, p0, :cond_1d

    .line 820
    .line 821
    iget-object p4, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 822
    .line 823
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object p4

    .line 827
    check-cast p4, Lte6;

    .line 828
    .line 829
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    iget-object v0, v0, Lne6;->d:Ljava/util/List;

    .line 834
    .line 835
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 836
    .line 837
    .line 838
    move-result v0

    .line 839
    move v2, v1

    .line 840
    :goto_1c
    if-ge v2, v0, :cond_1c

    .line 841
    .line 842
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    iget-object v3, v3, Lne6;->d:Ljava/util/List;

    .line 847
    .line 848
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    check-cast v3, Lme6;

    .line 853
    .line 854
    invoke-interface {p4}, Lte6;->getRequest()Lne6;

    .line 855
    .line 856
    .line 857
    move-result-object v4

    .line 858
    invoke-interface {v3, v4}, Lme6;->a0(Lne6;)V

    .line 859
    .line 860
    .line 861
    add-int/lit8 v2, v2, 0x1

    .line 862
    .line 863
    goto :goto_1c

    .line 864
    :cond_1c
    add-int/lit8 p3, p3, 0x1

    .line 865
    .line 866
    goto :goto_1b

    .line 867
    :cond_1d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 868
    .line 869
    .line 870
    goto :goto_1d

    .line 871
    :catchall_6
    move-exception v0

    .line 872
    move-object p0, v0

    .line 873
    monitor-exit p3

    .line 874
    throw p0

    .line 875
    :cond_1e
    :goto_1d
    throw p2

    .line 876
    :catch_0
    iget-boolean p2, p1, Lqf0;->b:Z

    .line 877
    .line 878
    if-nez p2, :cond_23

    .line 879
    .line 880
    iget-object p2, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast p2, Ljava/util/ArrayList;

    .line 883
    .line 884
    monitor-enter p2

    .line 885
    :try_start_f
    iget-object p0, p0, Lxm0;->Z:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast p0, Ljava/util/ArrayList;

    .line 888
    .line 889
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 890
    .line 891
    .line 892
    monitor-exit p2

    .line 893
    const-string p0, "InvokeInternalListeners"

    .line 894
    .line 895
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 899
    .line 900
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 901
    .line 902
    .line 903
    move-result p0

    .line 904
    move p2, v1

    .line 905
    :goto_1e
    if-ge p2, p0, :cond_20

    .line 906
    .line 907
    iget-object p3, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 908
    .line 909
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object p3

    .line 913
    check-cast p3, Lte6;

    .line 914
    .line 915
    iget-object p4, p1, Lqf0;->e:Ljava/util/List;

    .line 916
    .line 917
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 918
    .line 919
    .line 920
    move-result p4

    .line 921
    move v0, v1

    .line 922
    :goto_1f
    if-ge v0, p4, :cond_1f

    .line 923
    .line 924
    iget-object v2, p1, Lqf0;->e:Ljava/util/List;

    .line 925
    .line 926
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    check-cast v2, Lme6;

    .line 931
    .line 932
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    invoke-interface {v2, v3}, Lme6;->a0(Lne6;)V

    .line 937
    .line 938
    .line 939
    add-int/lit8 v0, v0, 0x1

    .line 940
    .line 941
    goto :goto_1f

    .line 942
    :cond_1f
    add-int/lit8 p2, p2, 0x1

    .line 943
    .line 944
    goto :goto_1e

    .line 945
    :cond_20
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 946
    .line 947
    .line 948
    const-string p0, "InvokeRequestListeners"

    .line 949
    .line 950
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    iget-object p0, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 954
    .line 955
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 956
    .line 957
    .line 958
    move-result p0

    .line 959
    move p2, v1

    .line 960
    :goto_20
    if-ge p2, p0, :cond_22

    .line 961
    .line 962
    iget-object p3, p1, Lqf0;->d:Ljava/util/ArrayList;

    .line 963
    .line 964
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object p3

    .line 968
    check-cast p3, Lte6;

    .line 969
    .line 970
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 971
    .line 972
    .line 973
    move-result-object p4

    .line 974
    iget-object p4, p4, Lne6;->d:Ljava/util/List;

    .line 975
    .line 976
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 977
    .line 978
    .line 979
    move-result p4

    .line 980
    move v0, v1

    .line 981
    :goto_21
    if-ge v0, p4, :cond_21

    .line 982
    .line 983
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    iget-object v2, v2, Lne6;->d:Ljava/util/List;

    .line 988
    .line 989
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    check-cast v2, Lme6;

    .line 994
    .line 995
    invoke-interface {p3}, Lte6;->getRequest()Lne6;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-interface {v2, v3}, Lme6;->a0(Lne6;)V

    .line 1000
    .line 1001
    .line 1002
    add-int/lit8 v0, v0, 0x1

    .line 1003
    .line 1004
    goto :goto_21

    .line 1005
    :cond_21
    add-int/lit8 p2, p2, 0x1

    .line 1006
    .line 1007
    goto :goto_20

    .line 1008
    :cond_22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_22

    .line 1012
    :catchall_7
    move-exception v0

    .line 1013
    move-object p0, v0

    .line 1014
    monitor-exit p2

    .line 1015
    throw p0

    .line 1016
    :catch_1
    :cond_23
    :goto_22
    return v1

    .line 1017
    :catchall_8
    move-exception v0

    .line 1018
    move-object p0, v0

    .line 1019
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1020
    .line 1021
    .line 1022
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Lxm0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "GraphRequestProcessor-"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lxm0;->Y:I

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
