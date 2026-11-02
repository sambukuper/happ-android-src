.class public final Lio/sentry/e7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/q1;


# instance fields
.field public final a:Lio/sentry/a5;

.field public b:Lio/sentry/a5;

.field public final c:Lio/sentry/f7;

.field public final d:Lio/sentry/b7;

.field public final e:Lio/sentry/i1;

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Lio/sentry/i7;

.field public i:Lio/sentry/g7;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/b7;Lio/sentry/o4;Lio/sentry/f7;Lio/sentry/i7;Lj78;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/e7;->f:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lio/sentry/e7;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/sentry/e7;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lio/sentry/util/a;

    .line 34
    .line 35
    iput-object p3, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 36
    .line 37
    iget-object v0, p4, Lio/sentry/i7;->d:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p3, Lio/sentry/f7;->k0:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p1, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 42
    .line 43
    const-string p1, "Scopes are required"

    .line 44
    .line 45
    invoke-static {p2, p1}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    .line 49
    .line 50
    iput-object p4, p0, Lio/sentry/e7;->h:Lio/sentry/i7;

    .line 51
    .line 52
    iput-object p5, p0, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 53
    .line 54
    iget-object p1, p4, Lio/sentry/i7;->a:Lio/sentry/a5;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    iput-object p1, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-virtual {p2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Lio/sentry/n7;Lio/sentry/b7;Lio/sentry/o4;Lio/sentry/o7;)V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Lio/sentry/e7;->f:Z

    .line 78
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/e7;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 81
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    new-instance v0, Lio/sentry/util/a;

    .line 83
    iput-object p1, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 84
    iget-object v0, p4, Lio/sentry/i7;->d:Ljava/lang/String;

    .line 85
    iput-object v0, p1, Lio/sentry/f7;->k0:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 87
    iput-object p3, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    const/4 p1, 0x0

    .line 88
    iput-object p1, p0, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 89
    iget-object p1, p4, Lio/sentry/i7;->a:Lio/sentry/a5;

    if-eqz p1, :cond_0

    .line 90
    iput-object p1, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p3}, Lio/sentry/o4;->i()Lio/sentry/s6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/b5;->a()Lio/sentry/a5;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 92
    :goto_0
    iput-object p4, p0, Lio/sentry/e7;->h:Lio/sentry/i7;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final c()Lio/sentry/y6;
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/y6;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    iget-object v1, p0, Lio/sentry/f7;->X:Lio/sentry/protocol/w;

    .line 6
    .line 7
    iget-object v2, p0, Lio/sentry/f7;->Y:Lio/sentry/h7;

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p0, p0, Lio/sentry/b4;->a:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/Boolean;

    .line 18
    .line 19
    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lio/sentry/y6;-><init>(Lio/sentry/protocol/w;Lio/sentry/h7;Ljava/lang/Boolean;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final d(Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;)Lio/sentry/q1;
    .locals 6

    .line 1
    new-instance v5, Lio/sentry/i7;

    .line 2
    .line 3
    invoke-direct {v5}, Lio/sentry/i7;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "activity.load"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    invoke-virtual/range {v0 .. v5}, Lio/sentry/e7;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;Lio/sentry/i7;)Lio/sentry/q1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lio/sentry/e7;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/e7;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    .line 6
    .line 7
    invoke-interface {p0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 16
    .line 17
    const-string v0, "The span is already finished. Measurement %s cannot be set"

    .line 18
    .line 19
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Lio/sentry/protocol/n;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p1, v1}, Lio/sentry/protocol/n;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 39
    .line 40
    iget-object v1, v0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 41
    .line 42
    if-eq v1, p0, :cond_1

    .line 43
    .line 44
    iget-object p0, v1, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, p1, p2}, Lio/sentry/b7;->g(Ljava/lang/Number;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final h(Lio/sentry/j7;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1, v0}, Lio/sentry/e7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/f7;->i0:Lio/sentry/j7;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/sentry/e7;->h(Lio/sentry/j7;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;Lio/sentry/i7;)Lio/sentry/q1;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v4, p5

    .line 4
    .line 5
    iget-boolean v1, p0, Lio/sentry/e7;->f:Z

    .line 6
    .line 7
    sget-object v2, Lio/sentry/l3;->a:Lio/sentry/l3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 13
    .line 14
    iget-object v8, v1, Lio/sentry/f7;->Y:Lio/sentry/h7;

    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 17
    .line 18
    iget-object p0, v1, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 19
    .line 20
    iget-object v3, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 21
    .line 22
    new-instance v5, Lio/sentry/f7;

    .line 23
    .line 24
    iget-object v6, v3, Lio/sentry/f7;->X:Lio/sentry/protocol/w;

    .line 25
    .line 26
    new-instance v7, Lio/sentry/h7;

    .line 27
    .line 28
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v11, v3, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    const-string v13, "manual"

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    move-object v9, p1

    .line 38
    invoke-direct/range {v5 .. v13}, Lio/sentry/f7;-><init>(Lio/sentry/protocol/w;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Lio/sentry/b4;Lio/sentry/j7;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object/from16 p1, p2

    .line 42
    .line 43
    move-object v3, v5

    .line 44
    iput-object p1, v3, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v0, v3, Lio/sentry/f7;->n0:Lio/sentry/x1;

    .line 47
    .line 48
    move-object/from16 p1, p3

    .line 49
    .line 50
    iput-object p1, v4, Lio/sentry/i7;->a:Lio/sentry/a5;

    .line 51
    .line 52
    iget-object p1, v1, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    iget-object v5, v1, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 55
    .line 56
    iget-boolean p0, p0, Lio/sentry/e7;->f:Z

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object p0, v1, Lio/sentry/b7;->o:Lio/sentry/x1;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v5}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lio/sentry/s6;->getIgnoredSpanOrigins()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object v0, v4, Lio/sentry/i7;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, p0}, Lio/sentry/util/p;->a(Ljava/lang/String;Ljava/util/List;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    :goto_0
    return-object v2

    .line 87
    :cond_3
    iget-object p0, v3, Lio/sentry/f7;->g0:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v0, v3, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v5}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v7}, Lio/sentry/s6;->getMaxSpans()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-ge v6, v7, :cond_5

    .line 104
    .line 105
    const-string v0, "parentSpanId is required"

    .line 106
    .line 107
    iget-object v2, v3, Lio/sentry/f7;->Z:Lio/sentry/h7;

    .line 108
    .line 109
    invoke-static {v2, v0}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v0, "operation is required"

    .line 113
    .line 114
    invoke-static {p0, v0}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lio/sentry/b7;->y()V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lio/sentry/e7;

    .line 121
    .line 122
    iget-object v2, v1, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 123
    .line 124
    new-instance v5, Lj78;

    .line 125
    .line 126
    const/16 p0, 0xa

    .line 127
    .line 128
    invoke-direct {v5, v1, p0}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v0 .. v5}, Lio/sentry/e7;-><init>(Lio/sentry/b7;Lio/sentry/o4;Lio/sentry/f7;Lio/sentry/i7;Lj78;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v0}, Lio/sentry/b7;->D(Lio/sentry/e7;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object p0, v1, Lio/sentry/b7;->q:Lio/sentry/o;

    .line 141
    .line 142
    if-eqz p0, :cond_4

    .line 143
    .line 144
    invoke-interface {p0, v0}, Lio/sentry/o;->d(Lio/sentry/e7;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    return-object v0

    .line 148
    :cond_5
    invoke-virtual {v5}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 157
    .line 158
    const-string v3, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    .line 159
    .line 160
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-interface {p1, v1, v3, p0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object v2
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 4
    .line 5
    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/s2;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/e7;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    .line 6
    .line 7
    invoke-interface {p0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 16
    .line 17
    const-string p3, "The span is already finished. Measurement %s cannot be set"

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p0, p2, p3, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Lio/sentry/protocol/n;

    .line 28
    .line 29
    invoke-virtual {p3}, Lio/sentry/s2;->apiName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, p2, v1}, Lio/sentry/protocol/n;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 42
    .line 43
    iget-object v1, v0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 44
    .line 45
    if-eq v1, p0, :cond_1

    .line 46
    .line 47
    iget-object p0, v1, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/b7;->r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/s2;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final s()Lio/sentry/f7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Lio/sentry/j7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/f7;->i0:Lio/sentry/j7;

    .line 4
    .line 5
    return-object p0
.end method

.method public final u()Lio/sentry/a5;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v(Lio/sentry/j7;Lio/sentry/a5;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/sentry/e7;->d:Lio/sentry/b7;

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 6
    .line 7
    iget-object v3, v2, Lio/sentry/f7;->Y:Lio/sentry/h7;

    .line 8
    .line 9
    iget-boolean v4, p0, Lio/sentry/e7;->f:Z

    .line 10
    .line 11
    if-nez v4, :cond_d

    .line 12
    .line 13
    iget-object v4, p0, Lio/sentry/e7;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    iput-object p1, v2, Lio/sentry/f7;->i0:Lio/sentry/j7;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lio/sentry/e7;->e:Lio/sentry/i1;

    .line 30
    .line 31
    invoke-interface {p1}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    :cond_1
    iput-object p2, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 44
    .line 45
    iget-object p1, p0, Lio/sentry/e7;->h:Lio/sentry/i7;

    .line 46
    .line 47
    iget-boolean p2, p1, Lio/sentry/i7;->c:Z

    .line 48
    .line 49
    if-eqz p2, :cond_b

    .line 50
    .line 51
    iget-object p2, v0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 52
    .line 53
    iget-object p2, p2, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 54
    .line 55
    iget-object p2, p2, Lio/sentry/f7;->Y:Lio/sentry/h7;

    .line 56
    .line 57
    invoke-virtual {p2, v3}, Lio/sentry/h7;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lio/sentry/e7;

    .line 84
    .line 85
    iget-object v2, v1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 86
    .line 87
    iget-object v2, v2, Lio/sentry/f7;->Z:Lio/sentry/h7;

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lio/sentry/h7;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    move-object v1, p2

    .line 102
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const/4 v0, 0x0

    .line 107
    move-object v1, v0

    .line 108
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const-wide/16 v3, 0x0

    .line 113
    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lio/sentry/e7;

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    iget-object v5, v2, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 125
    .line 126
    invoke-virtual {v5, v0}, Lio/sentry/a5;->b(Lio/sentry/a5;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v7

    .line 130
    cmp-long v5, v7, v3

    .line 131
    .line 132
    if-gez v5, :cond_7

    .line 133
    .line 134
    :cond_6
    iget-object v0, v2, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 135
    .line 136
    :cond_7
    if-eqz v1, :cond_8

    .line 137
    .line 138
    iget-object v5, v2, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 139
    .line 140
    if-eqz v5, :cond_5

    .line 141
    .line 142
    invoke-virtual {v5, v1}, Lio/sentry/a5;->b(Lio/sentry/a5;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v7

    .line 146
    cmp-long v3, v7, v3

    .line 147
    .line 148
    if-lez v3, :cond_5

    .line 149
    .line 150
    :cond_8
    iget-object v1, v2, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    iget-boolean p1, p1, Lio/sentry/i7;->c:Z

    .line 154
    .line 155
    if-eqz p1, :cond_b

    .line 156
    .line 157
    if-eqz v1, :cond_b

    .line 158
    .line 159
    iget-object p1, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 160
    .line 161
    if-eqz p1, :cond_a

    .line 162
    .line 163
    invoke-virtual {p1, v1}, Lio/sentry/a5;->b(Lio/sentry/a5;)J

    .line 164
    .line 165
    .line 166
    move-result-wide p1

    .line 167
    cmp-long p1, p1, v3

    .line 168
    .line 169
    if-lez p1, :cond_b

    .line 170
    .line 171
    :cond_a
    iget-object p1, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 172
    .line 173
    if-eqz p1, :cond_b

    .line 174
    .line 175
    iput-object v1, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 176
    .line 177
    :cond_b
    iget-object p1, p0, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 178
    .line 179
    if-eqz p1, :cond_c

    .line 180
    .line 181
    invoke-interface {p1, p0}, Lio/sentry/g7;->d(Lio/sentry/e7;)V

    .line 182
    .line 183
    .line 184
    :cond_c
    iput-boolean v6, p0, Lio/sentry/e7;->f:Z

    .line 185
    .line 186
    :cond_d
    :goto_3
    return-void
.end method

.method public final w()Lio/sentry/a5;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 2
    .line 3
    return-object p0
.end method
