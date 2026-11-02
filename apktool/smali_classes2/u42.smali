.class public final Lu42;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Loh7;

.field public final c:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw01;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lw01;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lu42;->a:Lvz7;

    .line 17
    .line 18
    sget-object v0, Lm02;->X:Lm02;

    .line 19
    .line 20
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lu42;->b:Loh7;

    .line 25
    .line 26
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lu42;->c:Lh76;

    .line 31
    .line 32
    invoke-virtual {p0}, Lu42;->b()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, ","

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x6

    .line 16
    invoke-static {p0, v0, v1}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, Lhu;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Ls42;->X:Ls42;

    .line 27
    .line 28
    invoke-static {v0, p0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v0, Lt42;->X:Lt42;

    .line 33
    .line 34
    new-instance v2, Lla2;

    .line 35
    .line 36
    invoke-direct {v2, p0, v1, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Lh80;

    .line 40
    .line 41
    const/16 v0, 0x17

    .line 42
    .line 43
    invoke-direct {p0, v0}, Lh80;-><init>(B)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lla2;

    .line 47
    .line 48
    invoke-direct {v0, v2, v1, p0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lh80;

    .line 52
    .line 53
    const/16 v1, 0x18

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lh80;-><init>(B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lw27;->o0(Lu27;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lub;Lub;)Ldn8;
    .locals 5

    .line 1
    sget-object v0, Ldn8;->a:Ldn8;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    if-eqz p3, :cond_3

    .line 10
    .line 11
    invoke-virtual {p3}, Lub;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    invoke-virtual {p3}, Lub;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lu42;->c(Ljava/lang/String;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lu42;->b:Loh7;

    .line 34
    .line 35
    :cond_2
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Ljava/util/Set;

    .line 41
    .line 42
    move-object v4, p1

    .line 43
    check-cast v4, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-static {v3, v4}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v1, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lu42;->d()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    move-object p1, v0

    .line 59
    goto :goto_2

    .line 60
    :goto_1
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 61
    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    new-instance p1, Lrj6;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/4 v1, 0x0

    .line 78
    if-nez p0, :cond_5

    .line 79
    .line 80
    check-cast p1, Ldn8;

    .line 81
    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    invoke-virtual {p2}, Lub;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-object v0, v1

    .line 89
    goto :goto_3

    .line 90
    :cond_5
    if-eqz p3, :cond_4

    .line 91
    .line 92
    invoke-virtual {p3}, Lub;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :goto_3
    return-object v0

    .line 96
    :cond_6
    throw p0
.end method

.method public final b()V
    .locals 5

    .line 1
    :cond_0
    iget-object v0, p0, Lu42;->b:Loh7;

    .line 2
    .line 3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Ljava/util/Set;

    .line 9
    .line 10
    sget-object v2, Lm02;->X:Lm02;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lu42;->a:Lvz7;

    .line 19
    .line 20
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 25
    .line 26
    const-string v1, "setting_exclude_routes"

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/16 v1, 0xa

    .line 33
    .line 34
    if-nez p0, :cond_3

    .line 35
    .line 36
    sget-object p0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lsu/happ/proxyutility/dto/RouteSettings;->d()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    new-instance v3, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 71
    .line 72
    invoke-static {v1}, Ljm4;->E(Ljava/lang/String;)Landroid/net/IpPrefix;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-direct {v3, v1, v4}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;-><init>(Ljava/lang/String;Landroid/net/IpPrefix;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-static {v2}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :cond_2
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    move-object v1, p0

    .line 92
    check-cast v1, Ljava/util/Set;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    :try_start_0
    new-instance v2, Lcom/google/gson/a;

    .line 102
    .line 103
    invoke-direct {v2}, Lcom/google/gson/a;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lr42;

    .line 107
    .line 108
    invoke-direct {v3}, Lyi8;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v3, v3, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 112
    .line 113
    invoke-virtual {v2, p0, v3}, Lcom/google/gson/a;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Ljava/util/Set;

    .line 118
    .line 119
    if-nez p0, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    check-cast p0, Ljava/lang/Iterable;

    .line 123
    .line 124
    new-instance v2, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/String;

    .line 148
    .line 149
    new-instance v3, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 150
    .line 151
    invoke-static {v1}, Ljm4;->E(Ljava/lang/String;)Landroid/net/IpPrefix;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-direct {v3, v1, v4}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;-><init>(Ljava/lang/String;Landroid/net/IpPrefix;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    invoke-static {v2}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    :cond_6
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    move-object v2, v1

    .line 171
    check-cast v2, Ljava/util/Set;

    .line 172
    .line 173
    invoke-virtual {v0, v1, p0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_6

    .line 178
    .line 179
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catchall_0
    move-exception p0

    .line 183
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 184
    .line 185
    if-nez v0, :cond_8

    .line 186
    .line 187
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 188
    .line 189
    if-nez v0, :cond_8

    .line 190
    .line 191
    new-instance v0, Lrj6;

    .line 192
    .line 193
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    move-object p0, v0

    .line 197
    :goto_3
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-eqz p0, :cond_7

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    :cond_7
    :goto_4
    return-void

    .line 207
    :cond_8
    throw p0
.end method

.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lu42;->b:Loh7;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object p0, p0, Lu42;->a:Lvz7;

    .line 14
    .line 15
    const-string v2, "setting_exclude_routes"

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/tencent/mmkv/MMKV;->contains(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 36
    .line 37
    const-string v0, ""

    .line 38
    .line 39
    invoke-virtual {p0, v2, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 48
    .line 49
    new-instance v1, Lcom/google/gson/a;

    .line 50
    .line 51
    invoke-direct {v1}, Lcom/google/gson/a;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Iterable;

    .line 59
    .line 60
    new-instance v3, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v4, 0xa

    .line 63
    .line 64
    invoke-static {v0, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 86
    .line 87
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v1, v3}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v2, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    return-object p0

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 111
    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    new-instance v0, Lrj6;

    .line 115
    .line 116
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_3
    throw p0
.end method

.method public final e(Ljava/lang/String;Lsu/happ/proxyutility/dto/ExcludeSettingsCache;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "value:"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Ljm4;->N(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    iget-object v0, p0, Lu42;->b:Loh7;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p2, :cond_3

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-static {v2}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lgu;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_0
    move-object v3, v2

    .line 32
    check-cast v3, Lrw1;

    .line 33
    .line 34
    iget-object v3, v3, Lrw1;->Y:Ljava/util/Iterator;

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, Lrw1;

    .line 44
    .line 45
    invoke-virtual {v3}, Lrw1;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, Lpb3;

    .line 51
    .line 52
    iget v5, v4, Lpb3;->a:I

    .line 53
    .line 54
    iget-object v4, v4, Lpb3;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 57
    .line 58
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v3, v1

    .line 74
    :goto_0
    check-cast v3, Lpb3;

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    iget p2, v3, Lpb3;->a:I

    .line 79
    .line 80
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object p2, v1

    .line 86
    :goto_1
    if-eqz p2, :cond_3

    .line 87
    .line 88
    move-object v1, p2

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-static {p2}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2}, Lgu;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    :cond_4
    move-object v2, p2

    .line 105
    check-cast v2, Lrw1;

    .line 106
    .line 107
    iget-object v2, v2, Lrw1;->Y:Ljava/util/Iterator;

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    move-object v2, p2

    .line 116
    check-cast v2, Lrw1;

    .line 117
    .line 118
    invoke-virtual {v2}, Lrw1;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v3, v2

    .line 123
    check-cast v3, Lpb3;

    .line 124
    .line 125
    iget v4, v3, Lpb3;->a:I

    .line 126
    .line 127
    iget-object v3, v3, Lpb3;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 130
    .line 131
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v3, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_4

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v2, v1

    .line 143
    :goto_2
    check-cast v2, Lpb3;

    .line 144
    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    iget p2, v2, Lpb3;->a:I

    .line 148
    .line 149
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    :cond_6
    :goto_3
    new-instance p2, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 154
    .line 155
    invoke-static {p1}, Ljm4;->E(Ljava/lang/String;)Landroid/net/IpPrefix;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-direct {p2, p1, v2}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;-><init>(Ljava/lang/String;Landroid/net/IpPrefix;)V

    .line 160
    .line 161
    .line 162
    if-nez v1, :cond_8

    .line 163
    .line 164
    :cond_7
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    move-object v1, p1

    .line 169
    check-cast v1, Ljava/util/Set;

    .line 170
    .line 171
    invoke-static {v1, p2}, Lq57;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0, p1, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    move-object v2, p1

    .line 187
    check-cast v2, Ljava/util/Set;

    .line 188
    .line 189
    new-instance v3, Lo57;

    .line 190
    .line 191
    invoke-direct {v3}, Lo57;-><init>()V

    .line 192
    .line 193
    .line 194
    move-object v4, v2

    .line 195
    check-cast v4, Ljava/lang/Iterable;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-static {v4, v5}, Lwv0;->U0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v3, v4}, Lo57;->addAll(Ljava/util/Collection;)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, p2}, Lo57;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    check-cast v2, Ljava/lang/Iterable;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    add-int/lit8 v4, v4, 0x1

    .line 218
    .line 219
    invoke-static {v2, v4}, Lwv0;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v3, v2}, Lo57;->addAll(Ljava/util/Collection;)Z

    .line 224
    .line 225
    .line 226
    invoke-static {v3}, Lw45;->m(Lo57;)Lo57;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v0, p1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-eqz p1, :cond_8

    .line 235
    .line 236
    :goto_4
    invoke-virtual {p0}, Lu42;->d()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    sget-object p0, Ldn8;->a:Ldn8;

    .line 244
    .line 245
    return-object p0

    .line 246
    :cond_9
    new-instance p0, Ljava/lang/Exception;

    .line 247
    .line 248
    new-instance p2, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string p1, " is NOT Ip Prefix"

    .line 257
    .line 258
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    :catchall_0
    move-exception p0

    .line 270
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 271
    .line 272
    if-nez p1, :cond_a

    .line 273
    .line 274
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 275
    .line 276
    if-nez p1, :cond_a

    .line 277
    .line 278
    new-instance p1, Lrj6;

    .line 279
    .line 280
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :cond_a
    throw p0
.end method
