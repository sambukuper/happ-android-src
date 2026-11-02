.class public final Lby0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/util/Collection;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Le26;[Le26;)V
    .locals 3

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 169
    iput-object v0, p0, Lby0;->c:Ljava/lang/Object;

    .line 170
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 171
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lby0;->e:Ljava/util/Collection;

    const/4 v1, 0x0

    .line 172
    iput-boolean v1, p0, Lby0;->a:Z

    .line 173
    iput-boolean v1, p0, Lby0;->b:Z

    .line 174
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lby0;->f:Ljava/lang/Object;

    .line 175
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 176
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 177
    const-string v2, "Null interface"

    invoke-static {v0, v2}, Ljb5;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 178
    :cond_0
    iget-object p0, p0, Lby0;->d:Ljava/lang/Object;

    check-cast p0, Ljava/util/HashSet;

    invoke-static {p0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 3

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 158
    iput-object v0, p0, Lby0;->c:Ljava/lang/Object;

    .line 159
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 160
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lby0;->e:Ljava/util/Collection;

    const/4 v1, 0x0

    .line 161
    iput-boolean v1, p0, Lby0;->a:Z

    .line 162
    iput-boolean v1, p0, Lby0;->b:Z

    .line 163
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lby0;->f:Ljava/lang/Object;

    .line 164
    invoke-static {p1}, Le26;->a(Ljava/lang/Class;)Le26;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 165
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 166
    const-string v2, "Null interface"

    invoke-static {v0, v2}, Ljb5;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    iget-object v2, p0, Lby0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-static {v0}, Le26;->a(Ljava/lang/Class;)Le26;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Llb1;Ltd5;)V
    .locals 9

    .line 1
    iget-object v0, p1, Llb1;->g:Lpl6;

    .line 2
    .line 3
    iget-object v1, p1, Llb1;->c:Lzw7;

    .line 4
    .line 5
    iget-object v4, p1, Llb1;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lby0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lby0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p1, Llb1;->e:Ljava/util/List;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Ld02;->X:Ld02;

    .line 19
    .line 20
    :cond_0
    iput-object v2, p0, Lby0;->e:Ljava/util/Collection;

    .line 21
    .line 22
    iget-object v2, p1, Llb1;->p:Lrr6;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v8, 0x1

    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v3, p1, Llb1;->a:Landroid/content/Context;

    .line 31
    .line 32
    new-instance v5, Lb8;

    .line 33
    .line 34
    iget p1, p2, Ltd5;->a:I

    .line 35
    .line 36
    invoke-direct {v5, p0, p1}, Lb8;-><init>(Lby0;I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lyw7;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-direct/range {v2 .. v7}, Lyw7;-><init>(Landroid/content/Context;Ljava/lang/String;Lb8;ZZ)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lxw7;

    .line 47
    .line 48
    new-instance p2, Llr5;

    .line 49
    .line 50
    invoke-interface {v1, v2}, Lzw7;->f(Lyw7;)Lax7;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {p2, v1}, Llr5;-><init>(Lax7;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Lxw7;-><init>(Llr5;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lby0;->f:Ljava/lang/Object;

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    const-string p0, "SQLiteManager was constructed with both null driver and open helper factory!"

    .line 64
    .line 65
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v3

    .line 69
    :cond_2
    if-nez v4, :cond_3

    .line 70
    .line 71
    new-instance p1, Ldq;

    .line 72
    .line 73
    invoke-direct {p1, p0, v2}, Ldq;-><init>(Lby0;Lrr6;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, Lw11;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Lw11;-><init>(Ldq;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    new-instance p1, Ldq;

    .line 83
    .line 84
    invoke-direct {p1, p0, v2}, Ldq;-><init>(Lby0;Lrr6;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    const/4 v1, 0x2

    .line 92
    if-eq p2, v8, :cond_5

    .line 93
    .line 94
    if-ne p2, v1, :cond_4

    .line 95
    .line 96
    const/4 p2, 0x4

    .line 97
    goto :goto_0

    .line 98
    :cond_4
    const-string p0, "Can\'t get max number of reader for journal mode \'"

    .line 99
    .line 100
    invoke-static {v0, p0}, Lkp5;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v3

    .line 104
    :cond_5
    move p2, v8

    .line 105
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eq v2, v8, :cond_7

    .line 110
    .line 111
    if-ne v2, v1, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    const-string p0, "Can\'t get max number of writers for journal mode \'"

    .line 115
    .line 116
    invoke-static {v0, p0}, Lkp5;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v3

    .line 120
    :cond_7
    :goto_1
    new-instance v1, Lw11;

    .line 121
    .line 122
    invoke-direct {v1, p1, v4, p2}, Lw11;-><init>(Ldq;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    move-object p2, v1

    .line 126
    :goto_2
    iput-object p2, p0, Lby0;->f:Ljava/lang/Object;

    .line 127
    .line 128
    :goto_3
    sget-object p1, Lpl6;->Y:Lpl6;

    .line 129
    .line 130
    if-ne v0, p1, :cond_8

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    const/4 v8, 0x0

    .line 134
    :goto_4
    invoke-virtual {p0}, Lby0;->e()Lax7;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_9

    .line 139
    .line 140
    invoke-interface {p0, v8}, Lax7;->setWriteAheadLoggingEnabled(Z)V

    .line 141
    .line 142
    .line 143
    :cond_9
    return-void
.end method

.method public constructor <init>(Llb1;Lzw5;)V
    .locals 3

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p1, p0, Lby0;->c:Ljava/lang/Object;

    .line 146
    new-instance p2, Lll6;

    const/4 v0, -0x1

    .line 147
    const-string v1, ""

    invoke-direct {p2, v1, v0, v1}, Ltd5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    iput-object p2, p0, Lby0;->d:Ljava/lang/Object;

    .line 149
    iget-object p2, p1, Llb1;->e:Ljava/util/List;

    sget-object v0, Ld02;->X:Ld02;

    if-nez p2, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iput-object v1, p0, Lby0;->e:Ljava/util/Collection;

    .line 150
    new-instance v1, Lt16;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lt16;-><init>(Ljava/lang/Object;B)V

    if-nez p2, :cond_1

    move-object p2, v0

    .line 151
    :cond_1
    new-instance p0, Lml6;

    invoke-direct {p0, v1}, Lml6;-><init>(Lt16;)V

    .line 152
    invoke-static {p2, p0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 153
    iget-object p0, p1, Llb1;->h:Ljava/util/concurrent/Executor;

    .line 154
    iget-object p1, p1, Llb1;->i:Ljava/util/concurrent/Executor;

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    new-instance p0, Lg65;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lg65;-><init>(I)V

    throw p0
.end method

.method public static c(Lqr6;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Lxr6;->S0()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Lxr6;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method


# virtual methods
.method public a(Lli1;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lli1;->a:Le26;

    .line 2
    .line 3
    iget-object v1, p0, Lby0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lby0;->e:Ljava/util/Collection;

    .line 14
    .line 15
    check-cast p0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "Components are not allowed to depend on interfaces they themselves provide."

    .line 22
    .line 23
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public b()Lcy0;
    .locals 9

    .line 1
    iget-object v0, p0, Lby0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lry0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lcy0;

    .line 13
    .line 14
    iget-object v0, p0, Lby0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    new-instance v3, Ljava/util/HashSet;

    .line 20
    .line 21
    iget-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Ljava/util/HashSet;

    .line 29
    .line 30
    iget-object v0, p0, Lby0;->e:Ljava/util/Collection;

    .line 31
    .line 32
    check-cast v0, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v4, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 35
    .line 36
    .line 37
    iget-boolean v5, p0, Lby0;->a:Z

    .line 38
    .line 39
    iget-boolean v6, p0, Lby0;->b:Z

    .line 40
    .line 41
    iget-object v0, p0, Lby0;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v7, v0

    .line 44
    check-cast v7, Lry0;

    .line 45
    .line 46
    iget-object p0, p0, Lby0;->f:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v8, p0

    .line 49
    check-cast v8, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-direct/range {v1 .. v8}, Lcy0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILry0;Ljava/util/Set;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_1
    const-string p0, "Missing required property: factory."

    .line 56
    .line 57
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public d(Lqr6;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltd5;

    .line 4
    .line 5
    const-string v1, "PRAGMA user_version = "

    .line 6
    .line 7
    iget-object v2, p0, Lby0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Llb1;

    .line 10
    .line 11
    iget-object v3, v2, Llb1;->g:Lpl6;

    .line 12
    .line 13
    sget-object v4, Lpl6;->Y:Lpl6;

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    const-string v3, "PRAGMA journal_mode = WAL"

    .line 18
    .line 19
    invoke-static {p1, v3}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v3, "PRAGMA journal_mode = TRUNCATE"

    .line 24
    .line 25
    invoke-static {p1, v3}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v2, v2, Llb1;->g:Lpl6;

    .line 29
    .line 30
    if-ne v2, v4, :cond_1

    .line 31
    .line 32
    const-string v2, "PRAGMA synchronous = NORMAL"

    .line 33
    .line 34
    invoke-static {p1, v2}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string v2, "PRAGMA synchronous = FULL"

    .line 39
    .line 40
    invoke-static {p1, v2}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-static {p1}, Lby0;->c(Lqr6;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "PRAGMA user_version"

    .line 47
    .line 48
    invoke-interface {p1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :try_start_0
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-interface {v2, v3}, Lxr6;->getLong(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    long-to-int v3, v3

    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-static {v2, v4}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    iget v2, v0, Ltd5;->a:I

    .line 66
    .line 67
    iget v0, v0, Ltd5;->a:I

    .line 68
    .line 69
    if-eq v3, v2, :cond_5

    .line 70
    .line 71
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 72
    .line 73
    invoke-static {p1, v2}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    if-nez v3, :cond_2

    .line 77
    .line 78
    :try_start_1
    invoke-virtual {p0, p1}, Lby0;->f(Lqr6;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_3

    .line 84
    :cond_2
    invoke-virtual {p0, p1, v3, v0}, Lby0;->g(Lqr6;II)V

    .line 85
    .line 86
    .line 87
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {p1, v0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :goto_3
    new-instance v1, Lrj6;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :goto_4
    nop

    .line 112
    instance-of v1, v0, Lrj6;

    .line 113
    .line 114
    if-nez v1, :cond_3

    .line 115
    .line 116
    move-object v1, v0

    .line 117
    check-cast v1, Ldn8;

    .line 118
    .line 119
    const-string v1, "END TRANSACTION"

    .line 120
    .line 121
    invoke-static {p1, v1}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_4

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    .line 132
    .line 133
    invoke-static {p1, p0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, Lby0;->h(Lqr6;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 143
    :catchall_2
    move-exception p1

    .line 144
    invoke-static {v2, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method

.method public e()Lax7;
    .locals 2

    .line 1
    iget-object p0, p0, Lby0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lt11;

    .line 4
    .line 5
    instance-of v0, p0, Lxw7;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lxw7;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lxw7;->X:Llr5;

    .line 17
    .line 18
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lax7;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    return-object v1
.end method

.method public f(Lqr6;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltd5;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 9
    .line 10
    invoke-interface {p1, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    cmp-long v2, v4, v6

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 36
    invoke-static {v1, v2}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ltd5;->a(Lqr6;)V

    .line 40
    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ltd5;->w(Lqr6;)Lrl6;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-boolean v2, v1, Lrl6;->a:Z

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string p0, "Pre-packaged database has an invalid schema: "

    .line 54
    .line 55
    iget-object p1, v1, Lrl6;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p1, p0}, Lkp5;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lby0;->i(Lqr6;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ltd5;->s(Lqr6;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lby0;->e:Ljava/util/Collection;

    .line 68
    .line 69
    check-cast p0, Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lol6;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    instance-of v0, p1, Lww7;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    move-object v0, p1

    .line 95
    check-cast v0, Lww7;

    .line 96
    .line 97
    iget-object v0, v0, Lww7;->X:Lsm2;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    return-void

    .line 104
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    :catchall_1
    move-exception p1

    .line 106
    invoke-static {v1, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public g(Lqr6;II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Lby0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Ltd5;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v5, v0, Lby0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v5, Llb1;

    .line 19
    .line 20
    iget-object v6, v5, Llb1;->d:Lt91;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x1

    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    sget-object v6, Ld02;->X:Ld02;

    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_0
    if-le v3, v2, :cond_1

    .line 31
    .line 32
    move v10, v9

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v10, v8

    .line 35
    :goto_0
    new-instance v11, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    move v12, v2

    .line 41
    :cond_2
    if-eqz v10, :cond_3

    .line 42
    .line 43
    if-ge v12, v3, :cond_b

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    if-le v12, v3, :cond_b

    .line 47
    .line 48
    :goto_1
    iget-object v13, v6, Lt91;->a:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    if-eqz v10, :cond_5

    .line 51
    .line 52
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v14

    .line 56
    invoke-virtual {v13, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    check-cast v13, Ljava/util/TreeMap;

    .line 61
    .line 62
    if-nez v13, :cond_4

    .line 63
    .line 64
    :goto_2
    const/4 v15, 0x0

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    invoke-virtual {v13}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    new-instance v15, Lqg5;

    .line 71
    .line 72
    invoke-direct {v15, v13, v14}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    invoke-virtual {v13, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    check-cast v13, Ljava/util/TreeMap;

    .line 85
    .line 86
    if-nez v13, :cond_6

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    invoke-virtual {v13}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    new-instance v15, Lqg5;

    .line 94
    .line 95
    invoke-direct {v15, v13, v14}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    if-nez v15, :cond_7

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_7
    iget-object v13, v15, Lqg5;->X:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v13, Ljava/util/Map;

    .line 104
    .line 105
    iget-object v14, v15, Lqg5;->Y:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v14, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    :cond_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-eqz v15, :cond_a

    .line 118
    .line 119
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    check-cast v15, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-eqz v10, :cond_9

    .line 130
    .line 131
    add-int/lit8 v7, v12, 0x1

    .line 132
    .line 133
    if-gt v7, v15, :cond_8

    .line 134
    .line 135
    if-gt v15, v3, :cond_8

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_9
    if-gt v3, v15, :cond_8

    .line 139
    .line 140
    if-ge v15, v12, :cond_8

    .line 141
    .line 142
    :goto_4
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move v7, v9

    .line 157
    move v12, v15

    .line 158
    goto :goto_5

    .line 159
    :cond_a
    move v7, v8

    .line 160
    :goto_5
    if-nez v7, :cond_2

    .line 161
    .line 162
    :goto_6
    const/4 v6, 0x0

    .line 163
    goto :goto_7

    .line 164
    :cond_b
    move-object v6, v11

    .line 165
    :goto_7
    if-eqz v6, :cond_e

    .line 166
    .line 167
    invoke-virtual {v4, v1}, Ltd5;->v(Lqr6;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_c

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Lpv4;

    .line 185
    .line 186
    invoke-virtual {v3, v1}, Lpv4;->b(Lqr6;)V

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_c
    invoke-virtual {v4, v1}, Ltd5;->w(Lqr6;)Lrl6;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iget-boolean v3, v2, Lrl6;->a:Z

    .line 195
    .line 196
    if-eqz v3, :cond_d

    .line 197
    .line 198
    invoke-virtual {v4, v1}, Ltd5;->u(Lqr6;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {p0 .. p1}, Lby0;->i(Lqr6;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_d
    const-string v0, "Migration didn\'t properly handle: "

    .line 206
    .line 207
    iget-object v1, v2, Lrl6;->b:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v1, v0}, Lkp5;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_e
    invoke-static {v5, v2, v3}, Ljb5;->x(Llb1;II)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-nez v6, :cond_17

    .line 218
    .line 219
    iget-boolean v2, v5, Llb1;->o:Z

    .line 220
    .line 221
    if-eqz v2, :cond_13

    .line 222
    .line 223
    const-string v2, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 224
    .line 225
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    :try_start_0
    invoke-static {}, Li21;->r()Lgb4;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    :cond_f
    :goto_9
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_11

    .line 238
    .line 239
    invoke-interface {v2, v8}, Lxr6;->p0(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    const-string v6, "sqlite_"

    .line 244
    .line 245
    invoke-static {v5, v8, v6}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    if-nez v6, :cond_f

    .line 250
    .line 251
    const-string v6, "android_metadata"

    .line 252
    .line 253
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_10

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_10
    invoke-interface {v2, v9}, Lxr6;->p0(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    const-string v7, "view"

    .line 265
    .line 266
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    new-instance v7, Lqg5;

    .line 275
    .line 276
    invoke-direct {v7, v5, v6}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v7}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :catchall_0
    move-exception v0

    .line 284
    move-object v1, v0

    .line 285
    goto :goto_b

    .line 286
    :cond_11
    invoke-static {v3}, Li21;->j(Lgb4;)Lgb4;

    .line 287
    .line 288
    .line 289
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    const/4 v5, 0x0

    .line 291
    invoke-static {v2, v5}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, v8}, Lgb4;->listIterator(I)Ljava/util/ListIterator;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    :goto_a
    move-object v3, v2

    .line 299
    check-cast v3, Lo03;

    .line 300
    .line 301
    invoke-virtual {v3}, Lo03;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_14

    .line 306
    .line 307
    invoke-virtual {v3}, Lo03;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    check-cast v3, Lqg5;

    .line 312
    .line 313
    iget-object v5, v3, Lqg5;->X:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v5, Ljava/lang/String;

    .line 316
    .line 317
    iget-object v3, v3, Lqg5;->Y:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v3, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_12

    .line 326
    .line 327
    new-instance v3, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v6, "DROP VIEW IF EXISTS "

    .line 330
    .line 331
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-static {v1, v3}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v6, "DROP TABLE IF EXISTS "

    .line 348
    .line 349
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-static {v1, v3}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    goto :goto_a

    .line 363
    :goto_b
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 364
    :catchall_1
    move-exception v0

    .line 365
    invoke-static {v2, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :cond_13
    invoke-virtual {v4, v1}, Ltd5;->c(Lqr6;)V

    .line 370
    .line 371
    .line 372
    :cond_14
    iget-object v0, v0, Lby0;->e:Ljava/util/Collection;

    .line 373
    .line 374
    check-cast v0, Ljava/util/List;

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    :cond_15
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_16

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Lol6;

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    instance-of v2, v1, Lww7;

    .line 396
    .line 397
    if-eqz v2, :cond_15

    .line 398
    .line 399
    move-object v2, v1

    .line 400
    check-cast v2, Lww7;

    .line 401
    .line 402
    iget-object v2, v2, Lww7;->X:Lsm2;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    goto :goto_c

    .line 408
    :cond_16
    invoke-virtual {v4, v1}, Ltd5;->a(Lqr6;)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 413
    .line 414
    new-instance v1, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    const-string v4, "A migration from "

    .line 417
    .line 418
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v2, " to "

    .line 425
    .line 426
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string v2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 433
    .line 434
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v0
.end method

.method public h(Lqr6;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lby0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ltd5;

    .line 7
    .line 8
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 9
    .line 10
    const-string v2, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 11
    .line 12
    invoke-interface {p1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :try_start_0
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v2, v5}, Lxr6;->getLong(I)J

    .line 25
    .line 26
    .line 27
    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    const-wide/16 v8, 0x0

    .line 29
    .line 30
    cmp-long v3, v6, v8

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    move v3, v4

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_0
    move v3, v5

    .line 40
    :goto_0
    const/4 v6, 0x0

    .line 41
    invoke-static {v2, v6}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    const-string v1, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 47
    .line 48
    invoke-interface {p1, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :try_start_1
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-interface {v1, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move-object v2, v6

    .line 66
    :goto_1
    invoke-static {v1, v6}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Ltd5;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_6

    .line 78
    .line 79
    iget-object v1, v0, Ltd5;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    iget-object p1, v0, Ltd5;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v1, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, ", found: "

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    :catchall_2
    move-exception p1

    .line 128
    invoke-static {v1, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_3
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 133
    .line 134
    invoke-static {p1, v2}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v0, p1}, Ltd5;->w(Lqr6;)Lrl6;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-boolean v3, v2, Lrl6;->a:Z

    .line 142
    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ltd5;->u(Lqr6;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1}, Lby0;->i(Lqr6;)V

    .line 149
    .line 150
    .line 151
    sget-object v1, Ldn8;->a:Ldn8;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :catchall_3
    move-exception v1

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    new-instance v5, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v2, Lrl6;->b:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 180
    :goto_3
    new-instance v2, Lrj6;

    .line 181
    .line 182
    invoke-direct {v2, v1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object v1, v2

    .line 186
    :goto_4
    nop

    .line 187
    instance-of v2, v1, Lrj6;

    .line 188
    .line 189
    if-nez v2, :cond_5

    .line 190
    .line 191
    move-object v2, v1

    .line 192
    check-cast v2, Ldn8;

    .line 193
    .line 194
    const-string v2, "END TRANSACTION"

    .line 195
    .line 196
    invoke-static {p1, v2}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_5
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-nez v1, :cond_9

    .line 204
    .line 205
    :cond_6
    :goto_5
    invoke-virtual {v0, p1}, Ltd5;->t(Lqr6;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lby0;->e:Ljava/util/Collection;

    .line 209
    .line 210
    check-cast v0, Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_8

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Lol6;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    instance-of v2, p1, Lww7;

    .line 232
    .line 233
    if-eqz v2, :cond_7

    .line 234
    .line 235
    move-object v2, p1

    .line 236
    check-cast v2, Lww7;

    .line 237
    .line 238
    iget-object v2, v2, Lww7;->X:Lsm2;

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Lol6;->a(Lsm2;)V

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_8
    iput-boolean v4, p0, Lby0;->a:Z

    .line 245
    .line 246
    return-void

    .line 247
    :cond_9
    const-string p0, "ROLLBACK TRANSACTION"

    .line 248
    .line 249
    invoke-static {p1, p0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v1

    .line 253
    :goto_7
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 254
    :catchall_4
    move-exception p1

    .line 255
    invoke-static {v2, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    throw p1
.end method

.method public i(Lqr6;)V
    .locals 2

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lby0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ltd5;

    .line 9
    .line 10
    iget-object p0, p0, Ltd5;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "\')"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1, p0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
