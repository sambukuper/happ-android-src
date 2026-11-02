.class public final Lsn0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfh0;


# instance fields
.field public final a:Lit2;

.field public final b:Lmn0;

.field public final c:Ly5;

.field public final d:Ljl0;

.field public final e:Lu08;

.field public final f:Lji0;

.field public final g:Lcl7;

.field public final h:Ls98;

.field public final i:Lb71;

.field public final j:I

.field public final k:Ljava/lang/Object;

.field public final l:Ltv;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/Map;

.field public o:Lya8;

.field public final p:Ly45;

.field public q:Lyh0;

.field public r:Lnn0;

.field public s:Ljava/util/Map;

.field public t:Ljava/util/LinkedHashMap;

.field public u:Lon0;

.field public final v:Ljava/util/concurrent/CountDownLatch;

.field public w:Z

.field public final x:Ljava/util/concurrent/CountDownLatch;

.field public y:Ljava/util/Map;

.field public final z:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lit2;Lmn0;Ly5;Ljl0;Lu08;Lji0;Lwl7;Lcl7;Ltl7;Ls98;Lb71;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lsn0;->a:Lit2;

    .line 23
    .line 24
    iput-object p2, p0, Lsn0;->b:Lmn0;

    .line 25
    .line 26
    iput-object p3, p0, Lsn0;->c:Ly5;

    .line 27
    .line 28
    iput-object p4, p0, Lsn0;->d:Ljl0;

    .line 29
    .line 30
    iput-object p5, p0, Lsn0;->e:Lu08;

    .line 31
    .line 32
    iput-object p6, p0, Lsn0;->f:Lji0;

    .line 33
    .line 34
    iput-object p8, p0, Lsn0;->g:Lcl7;

    .line 35
    .line 36
    iput-object p10, p0, Lsn0;->h:Ls98;

    .line 37
    .line 38
    iput-object p11, p0, Lsn0;->i:Lb71;

    .line 39
    .line 40
    sget-object p1, Ltn0;->a:Lqv;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p2, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, Lsn0;->j:I

    .line 52
    .line 53
    new-instance p1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lsn0;->k:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-static {p1}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lsn0;->l:Ltv;

    .line 67
    .line 68
    new-instance p1, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lsn0;->m:Ljava/util/Map;

    .line 78
    .line 79
    new-instance p1, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lsn0;->n:Ljava/util/Map;

    .line 89
    .line 90
    if-eqz p7, :cond_0

    .line 91
    .line 92
    new-instance p1, Ly45;

    .line 93
    .line 94
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    sget-object p2, Ll57;->X:Ll57;

    .line 101
    .line 102
    invoke-static {p2}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, p1, Ly45;->X:Ljava/lang/Object;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 p1, 0x0

    .line 110
    :goto_0
    iput-object p1, p0, Lsn0;->p:Ly45;

    .line 111
    .line 112
    sget-object p1, Lon0;->X:Lon0;

    .line 113
    .line 114
    iput-object p1, p0, Lsn0;->u:Lon0;

    .line 115
    .line 116
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 117
    .line 118
    const/4 p2, 0x1

    .line 119
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Lsn0;->v:Ljava/util/concurrent/CountDownLatch;

    .line 123
    .line 124
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 125
    .line 126
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lsn0;->x:Ljava/util/concurrent/CountDownLatch;

    .line 130
    .line 131
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lsn0;->z:Ljava/util/LinkedHashMap;

    .line 137
    .line 138
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, p0, Lsn0;->l:Ltv;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ltv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "#onSessionFinalized"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lsn0;->n()V

    .line 37
    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lsn0;->m(J)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "#onSessionDisconnected"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lsn0;->k()V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "#onSessionDisconnected Await"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lsn0;->v:Ljava/util/concurrent/CountDownLatch;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    throw p0
.end method

.method public final c(Lgh0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Lgh0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, "#onClosed"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lsn0;->n()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lsn0;->x:Ljava/util/concurrent/CountDownLatch;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lsn0;->p:Ly45;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Ly45;->J()V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final e(Lgh0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f(Lgh0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lgh0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "#configure"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lsn0;->i(Lgh0;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lsn0;->x:Ljava/util/concurrent/CountDownLatch;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lsn0;->p:Ly45;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Ly45;->J()V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final h(Lgh0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, "#onConfigureFailed"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lmt2;

    .line 25
    .line 26
    const/16 v0, 0x9

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p1, v0, v1}, Lmt2;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lsn0;->a:Lit2;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lit2;->a(Lmt2;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lsn0;->n()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lsn0;->x:Ljava/util/concurrent/CountDownLatch;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lsn0;->p:Ly45;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Ly45;->J()V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final i(Lgh0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lsn0;->r:Lnn0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lsn0;->c:Ly5;

    .line 11
    .line 12
    iget-object v2, p0, Lsn0;->m:Ljava/util/Map;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lsn0;->n:Ljava/util/Map;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1, v2, v3}, Ly5;->A(Lgh0;Ljava/util/Map;Ljava/util/Map;)Lsf0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lnn0;

    .line 27
    .line 28
    new-instance v3, Lxm0;

    .line 29
    .line 30
    invoke-direct {v3, v1}, Lxm0;-><init>(Lsf0;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p1, v3, v1}, Lnn0;-><init>(Lgh0;Lxm0;Lsf0;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lsn0;->r:Lnn0;

    .line 37
    .line 38
    move-object v1, v2

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    :goto_0
    iget-object p1, p0, Lsn0;->u:Lon0;

    .line 44
    .line 45
    sget-object v2, Lon0;->Z:Lon0;

    .line 46
    .line 47
    if-ne p1, v2, :cond_5

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    iget-object p1, p0, Lsn0;->s:Ljava/util/Map;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    const/4 v3, 0x0

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lsn0;->t:Ljava/util/LinkedHashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    move p1, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move p1, v3

    .line 66
    :goto_1
    monitor-exit v0

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Lsn0;->l(Z)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p1, p0, Lsn0;->k:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter p1

    .line 75
    :try_start_1
    iget-object v0, p0, Lsn0;->e:Lu08;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    iget-object v0, p0, Lsn0;->o:Lya8;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-wide v5, v0, Lya8;->a:J

    .line 90
    .line 91
    sub-long/2addr v3, v5

    .line 92
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    const-string v0, "%.3f ms"

    .line 96
    .line 97
    long-to-double v3, v3

    .line 98
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    div-double/2addr v3, v5

    .line 104
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-static {v3, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    iget-object p0, p0, Lsn0;->a:Lit2;

    .line 121
    .line 122
    iget-object v0, v1, Lnn0;->b:Lxm0;

    .line 123
    .line 124
    invoke-virtual {p0}, Lit2;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lit2;->d:Loh7;

    .line 128
    .line 129
    sget-object v2, Lnt2;->b:Lnt2;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Loh7;->m(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p0, Lit2;->b:Lht2;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lht2;->X(Lxm0;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, Lit2;->c:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lst2;

    .line 156
    .line 157
    iget-object v1, v0, Lst2;->a:Lok0;

    .line 158
    .line 159
    invoke-virtual {v0}, Lst2;->a()Lqi0;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v1, v0, v2}, Lok0;->b(Lqi0;Lrt2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    monitor-exit p1

    .line 168
    return-void

    .line 169
    :catchall_1
    move-exception p0

    .line 170
    monitor-exit p1

    .line 171
    throw p0

    .line 172
    :cond_5
    :goto_3
    monitor-exit v0

    .line 173
    return-void

    .line 174
    :goto_4
    monitor-exit v0

    .line 175
    throw p0
.end method

.method public final j(Ljava/util/Map;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lsn0;->u:Lon0;

    .line 8
    .line 9
    sget-object v2, Lon0;->f0:Lon0;

    .line 10
    .line 11
    if-eq v1, v2, :cond_5

    .line 12
    .line 13
    sget-object v2, Lon0;->g0:Lon0;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v1, p0, Lsn0;->y:Ljava/util/Map;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Le02;->X:Le02;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0, v1, p1}, Lsn0;->p(Ljava/util/Map;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lsn0;->y:Ljava/util/Map;

    .line 31
    .line 32
    iget-object v1, p0, Lsn0;->s:Ljava/util/Map;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x3

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    iget-object v5, p0, Lsn0;->t:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    if-nez v5, :cond_4

    .line 42
    .line 43
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {v1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-ne p1, v1, :cond_4

    .line 99
    .line 100
    iput-object v5, p0, Lsn0;->t:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    iget-object p1, p0, Lsn0;->i:Lb71;

    .line 103
    .line 104
    new-instance v1, Ll40;

    .line 105
    .line 106
    invoke-direct {v1, p0, v4, v2}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v4, v4, v1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object p1, p0, Lsn0;->i:Lb71;

    .line 113
    .line 114
    new-instance v1, Lpn0;

    .line 115
    .line 116
    invoke-direct {v1, p0, v4, v2}, Lpn0;-><init>(Lsn0;Lq51;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v4, v4, v1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    :cond_5
    :goto_2
    monitor-exit v0

    .line 123
    return-void

    .line 124
    :goto_3
    monitor-exit v0

    .line 125
    throw p0
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lsn0;->u:Lon0;

    .line 5
    .line 6
    sget-object v2, Lon0;->f0:Lon0;

    .line 7
    .line 8
    if-eq v1, v2, :cond_9

    .line 9
    .line 10
    sget-object v3, Lon0;->g0:Lon0;

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    iput-object v2, p0, Lsn0;->u:Lon0;

    .line 17
    .line 18
    iget-object v1, p0, Lsn0;->r:Lnn0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iput-object v2, p0, Lsn0;->r:Lnn0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lsn0;->f:Lji0;

    .line 31
    .line 32
    iget-boolean v1, v1, Lji0;->d:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-boolean v1, p0, Lsn0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_0
    monitor-exit v0

    .line 43
    iget-object v0, p0, Lsn0;->p:Ly45;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Ly45;->J()V

    .line 48
    .line 49
    .line 50
    :cond_3
    const/4 v0, 0x2

    .line 51
    const-wide/16 v4, 0xbb8

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lsn0;->h:Ls98;

    .line 56
    .line 57
    new-instance v3, Lli;

    .line 58
    .line 59
    invoke-direct {v3, p0, v2, v0}, Lli;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v4, v5, v3}, Ls98;->b(JLgn2;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ldn8;

    .line 67
    .line 68
    iget-object v1, p0, Lsn0;->k:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v1

    .line 71
    :try_start_1
    iget-object v3, p0, Lsn0;->r:Lnn0;

    .line 72
    .line 73
    iput-object v2, p0, Lsn0;->r:Lnn0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    monitor-exit v1

    .line 76
    move-object v1, v3

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    monitor-exit v1

    .line 80
    throw p0

    .line 81
    :cond_4
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v6, p0, Lsn0;->a:Lit2;

    .line 87
    .line 88
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v6, "#onGraphStopping"

    .line 92
    .line 93
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v3, p0, Lsn0;->a:Lit2;

    .line 104
    .line 105
    invoke-virtual {v3}, Lit2;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    iget-object v6, v3, Lit2;->d:Loh7;

    .line 109
    .line 110
    sget-object v7, Lpt2;->b:Lpt2;

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Loh7;->m(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v6, v3, Lit2;->b:Lht2;

    .line 116
    .line 117
    invoke-virtual {v6, v2}, Lht2;->X(Lxm0;)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v3, Lit2;->c:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_5

    .line 131
    .line 132
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lst2;

    .line 137
    .line 138
    iget-object v7, v6, Lst2;->a:Lok0;

    .line 139
    .line 140
    invoke-virtual {v6}, Lst2;->a()Lqi0;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    sget-object v8, Lpt2;->b:Lpt2;

    .line 145
    .line 146
    invoke-virtual {v7, v6, v8}, Lok0;->b(Lqi0;Lrt2;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 151
    .line 152
    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    iget-object v3, v1, Lnn0;->b:Lxm0;

    .line 156
    .line 157
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    new-instance v6, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v7, "#shutdown"

    .line 169
    .line 170
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object v6, p0, Lsn0;->f:Lji0;

    .line 181
    .line 182
    iget-boolean v6, v6, Lji0;->a:Z

    .line 183
    .line 184
    if-eqz v6, :cond_6

    .line 185
    .line 186
    iget-object v6, p0, Lsn0;->h:Ls98;

    .line 187
    .line 188
    new-instance v7, Lki;

    .line 189
    .line 190
    const/4 v8, 0x3

    .line 191
    invoke-direct {v7, p0, v3, v2, v8}, Lki;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 192
    .line 193
    .line 194
    const-wide/16 v8, 0x7d0

    .line 195
    .line 196
    invoke-virtual {v6, v8, v9, v7}, Ls98;->b(JLgn2;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Ldn8;

    .line 201
    .line 202
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v6, "#disconnect"

    .line 211
    .line 212
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v3, v1, Lnn0;->c:Lsf0;

    .line 223
    .line 224
    invoke-virtual {v3}, Lsf0;->b()V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 228
    .line 229
    .line 230
    iget-object v3, p0, Lsn0;->f:Lji0;

    .line 231
    .line 232
    iget-boolean v3, v3, Lji0;->d:Z

    .line 233
    .line 234
    if-eqz v3, :cond_7

    .line 235
    .line 236
    iget-object v3, p0, Lsn0;->h:Ls98;

    .line 237
    .line 238
    new-instance v6, Lki;

    .line 239
    .line 240
    invoke-direct {v6, p0, v1, v2, v0}, Lki;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v4, v5, v6}, Ls98;->b(JLgn2;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Ldn8;

    .line 248
    .line 249
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    iget-object v1, p0, Lsn0;->a:Lit2;

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v1, "#onGraphStopped"

    .line 260
    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lsn0;->a:Lit2;

    .line 272
    .line 273
    invoke-virtual {v0}, Lit2;->b()V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    iget-object v1, p0, Lsn0;->a:Lit2;

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v1, "#onGraphStopped"

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, p0, Lsn0;->a:Lit2;

    .line 306
    .line 307
    invoke-virtual {v0}, Lit2;->b()V

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 311
    .line 312
    .line 313
    :goto_3
    iget-object p0, p0, Lsn0;->v:Ljava/util/concurrent/CountDownLatch;

    .line 314
    .line 315
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :cond_9
    :goto_4
    monitor-exit v0

    .line 320
    return-void

    .line 321
    :goto_5
    monitor-exit v0

    .line 322
    throw p0
.end method

.method public final l(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lsn0;->r:Lnn0;

    .line 5
    .line 6
    iget-object v2, p0, Lsn0;->s:Ljava/util/Map;

    .line 7
    .line 8
    iget-object v3, p0, Lsn0;->t:Ljava/util/LinkedHashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    if-eqz v2, :cond_9

    .line 14
    .line 15
    if-eqz v3, :cond_9

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v4, "#finalizeOutputConfigurations"

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lsn0;->e:Lu08;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, Ldl7;

    .line 71
    .line 72
    iget v8, v7, Ldl7;->a:I

    .line 73
    .line 74
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, Laf;

    .line 79
    .line 80
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    if-eqz v7, :cond_0

    .line 85
    .line 86
    check-cast v7, Landroid/view/Surface;

    .line 87
    .line 88
    invoke-virtual {v6, v7}, Laf;->a(Landroid/view/Surface;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const-string p0, "Required value was null."

    .line 93
    .line 94
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_2

    .line 116
    .line 117
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Laf;

    .line 128
    .line 129
    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v1, v1, Lnn0;->a:Lgh0;

    .line 138
    .line 139
    invoke-interface {v1, v0}, Lgh0;->x0(Ljava/util/List;)Z

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v0

    .line 145
    :try_start_1
    iget-object v1, p0, Lsn0;->u:Lon0;

    .line 146
    .line 147
    sget-object v6, Lon0;->Z:Lon0;

    .line 148
    .line 149
    if-ne v1, v6, :cond_7

    .line 150
    .line 151
    iget-object v1, p0, Lsn0;->m:Ljava/util/Map;

    .line 152
    .line 153
    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    const/4 v6, 0x1

    .line 169
    if-eqz v3, :cond_5

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    check-cast v7, Ldl7;

    .line 182
    .line 183
    iget v7, v7, Ldl7;->a:I

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Landroid/view/Surface;

    .line 190
    .line 191
    iget-object v8, p0, Lsn0;->g:Lcl7;

    .line 192
    .line 193
    invoke-virtual {v8, v7}, Lcl7;->g(I)Lfl0;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    if-eqz v7, :cond_4

    .line 198
    .line 199
    iget-object v8, v7, Lfl0;->b:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-ne v8, v6, :cond_3

    .line 206
    .line 207
    iget-object v6, p0, Lsn0;->n:Ljava/util/Map;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v7, v7, Lfl0;->b:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-static {v7}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    check-cast v7, Lbl7;

    .line 219
    .line 220
    iget v7, v7, Lbl7;->a:I

    .line 221
    .line 222
    new-instance v8, Lpe5;

    .line 223
    .line 224
    invoke-direct {v8, v7}, Lpe5;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v6, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :catchall_0
    move-exception p0

    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_3
    const-string p0, "Cannot finalize a multi-output stream!"

    .line 235
    .line 236
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 237
    .line 238
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_4
    const-string p0, "Required value was null."

    .line 243
    .line 244
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_5
    iget-object v1, p0, Lsn0;->e:Lu08;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 256
    .line 257
    .line 258
    move-result-wide v7

    .line 259
    sub-long/2addr v7, v4

    .line 260
    new-instance v1, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-eqz v3, :cond_6

    .line 282
    .line 283
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, Ljava/util/Map$Entry;

    .line 288
    .line 289
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    check-cast v3, Ldl7;

    .line 294
    .line 295
    iget v4, v3, Ldl7;->a:I

    .line 296
    .line 297
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const-string v2, "%."

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const/4 v2, 0x3

    .line 318
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v2, "f ms"

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    long-to-double v2, v7

    .line 331
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    div-double/2addr v2, v4

    .line 337
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    const/4 v3, 0x0

    .line 350
    invoke-static {v3, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_7
    const/4 v6, 0x0

    .line 355
    :goto_4
    monitor-exit v0

    .line 356
    if-eqz v6, :cond_8

    .line 357
    .line 358
    if-eqz p1, :cond_8

    .line 359
    .line 360
    iget-object p0, p0, Lsn0;->a:Lit2;

    .line 361
    .line 362
    invoke-virtual {p0}, Lit2;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    iget-object p0, p0, Lit2;->b:Lht2;

    .line 366
    .line 367
    iget-object p0, p0, Lht2;->i0:Ly5;

    .line 368
    .line 369
    sget-object p1, Lvs2;->b:Lvs2;

    .line 370
    .line 371
    invoke-virtual {p0, p1}, Ly5;->g0(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    :cond_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :goto_5
    monitor-exit v0

    .line 379
    throw p0

    .line 380
    :cond_9
    return-void

    .line 381
    :catchall_1
    move-exception p0

    .line 382
    monitor-exit v0

    .line 383
    throw p0
.end method

.method public final m(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lsn0;->i:Lb71;

    .line 8
    .line 9
    new-instance v1, Lqn0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, p2, p0, v2}, Lqn0;-><init>(JLsn0;Lq51;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x3

    .line 16
    invoke-static {v0, v2, v2, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lsn0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter p1

    .line 26
    :try_start_0
    iget-object p2, p0, Lsn0;->z:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-static {p2}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object p0, p0, Lsn0;->z:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    monitor-exit p1

    .line 44
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_a

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 59
    .line 60
    instance-of p2, p1, Ljava/lang/AutoCloseable;

    .line 61
    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    instance-of p2, p1, Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p1, p2, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_1

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    :cond_4
    :goto_1
    if-nez p2, :cond_5

    .line 92
    .line 93
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 94
    .line 95
    const-wide/16 v2, 0x1

    .line 96
    .line 97
    invoke-interface {p1, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 98
    .line 99
    .line 100
    move-result p2
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    goto :goto_1

    .line 102
    :catch_0
    if-nez v0, :cond_4

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    if-eqz v0, :cond_1

    .line 110
    .line 111
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    instance-of p2, p1, Landroid/content/res/TypedArray;

    .line 120
    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    check-cast p1, Landroid/content/res/TypedArray;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    instance-of p2, p1, Landroid/media/MediaMetadataRetriever;

    .line 130
    .line 131
    if-eqz p2, :cond_8

    .line 132
    .line 133
    check-cast p1, Landroid/media/MediaMetadataRetriever;

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    instance-of p2, p1, Landroid/media/MediaDrm;

    .line 140
    .line 141
    if-eqz p2, :cond_9

    .line 142
    .line 143
    check-cast p1, Landroid/media/MediaDrm;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/media/MediaDrm;->release()V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_9
    invoke-static {}, Lkp5;->e()V

    .line 150
    .line 151
    .line 152
    :cond_a
    return-void

    .line 153
    :catchall_0
    move-exception p0

    .line 154
    monitor-exit p1

    .line 155
    throw p0
.end method

.method public final n()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lsn0;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsn0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lsn0;->u:Lon0;

    .line 8
    .line 9
    sget-object v2, Lon0;->g0:Lon0;

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-eq v1, v2, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lsn0;->q:Lyh0;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-boolean v1, p0, Lsn0;->w:Z

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lsn0;->f:Lji0;

    .line 26
    .line 27
    iget v1, v1, Lji0;->c:I

    .line 28
    .line 29
    if-ne v1, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v6, 0x2

    .line 33
    if-ne v1, v6, :cond_2

    .line 34
    .line 35
    const-wide/16 v3, 0x7d0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v5, 0x0

    .line 41
    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 42
    iput-object v1, p0, Lsn0;->q:Lyh0;

    .line 43
    .line 44
    iput-object v2, p0, Lsn0;->u:Lon0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, v3, v4}, Lsn0;->m(J)V

    .line 50
    .line 51
    .line 52
    :cond_4
    return-void

    .line 53
    :goto_1
    monitor-exit v0

    .line 54
    throw p0
.end method

.method public final o(Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, "Unexpected state: "

    .line 2
    .line 3
    instance-of v1, p1, Lrn0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lrn0;

    .line 9
    .line 10
    iget v2, v1, Lrn0;->j0:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lrn0;->j0:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lrn0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lrn0;-><init>(Lsn0;Ls51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lrn0;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lc71;->X:Lc71;

    .line 30
    .line 31
    iget v3, v1, Lrn0;->j0:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Lrn0;->g0:Lea6;

    .line 40
    .line 41
    iget-object v1, v1, Lrn0;->f0:Lea6;

    .line 42
    .line 43
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lea6;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lea6;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v6, p0, Lsn0;->k:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v6

    .line 69
    :try_start_0
    iget-object v7, p0, Lsn0;->u:Lon0;

    .line 70
    .line 71
    sget-object v8, Lon0;->X:Lon0;

    .line 72
    .line 73
    if-eq v7, v8, :cond_3

    .line 74
    .line 75
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    monitor-exit v6

    .line 78
    return-object p0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :cond_3
    :try_start_1
    iget-object v7, p0, Lsn0;->y:Ljava/util/Map;

    .line 83
    .line 84
    iput-object v7, p1, Lea6;->X:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v7, p0, Lsn0;->q:Lyh0;

    .line 87
    .line 88
    iput-object v7, v3, Lea6;->X:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v8, p1, Lea6;->X:Ljava/lang/Object;

    .line 91
    .line 92
    if-eqz v8, :cond_12

    .line 93
    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_4
    sget-object v7, Lon0;->Y:Lon0;

    .line 99
    .line 100
    iput-object v7, p0, Lsn0;->u:Lon0;

    .line 101
    .line 102
    iput-boolean v4, p0, Lsn0;->w:Z

    .line 103
    .line 104
    iget-object v7, p0, Lsn0;->e:Lu08;

    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    new-instance v9, Lya8;

    .line 114
    .line 115
    invoke-direct {v9, v7, v8}, Lya8;-><init>(J)V

    .line 116
    .line 117
    .line 118
    iput-object v9, p0, Lsn0;->o:Lya8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    monitor-exit v6

    .line 121
    iget-object v6, p0, Lsn0;->p:Ly45;

    .line 122
    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    iput-object p1, v1, Lrn0;->f0:Lea6;

    .line 126
    .line 127
    iput-object v3, v1, Lrn0;->g0:Lea6;

    .line 128
    .line 129
    iput v4, v1, Lrn0;->j0:I

    .line 130
    .line 131
    invoke-virtual {v6, v1}, Ly45;->x(Ls51;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-ne v1, v2, :cond_5

    .line 136
    .line 137
    return-object v2

    .line 138
    :cond_5
    move-object v1, p1

    .line 139
    move-object v2, v3

    .line 140
    :goto_1
    move-object p1, v1

    .line 141
    move-object v3, v2

    .line 142
    :cond_6
    iget-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lyh0;

    .line 145
    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    invoke-interface {v1}, Lyh0;->m()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    goto :goto_2

    .line 153
    :cond_7
    move-object v1, v5

    .line 154
    :goto_2
    if-nez v1, :cond_8

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    invoke-static {v1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    :goto_3
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    iget-object v1, p1, Lea6;->X:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v2, "CameraDevice-"

    .line 171
    .line 172
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget-object v2, v3, Lea6;->X:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Lyh0;

    .line 178
    .line 179
    if-eqz v2, :cond_9

    .line 180
    .line 181
    invoke-interface {v2}, Lyh0;->m()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    goto :goto_4

    .line 186
    :cond_9
    move-object v2, v5

    .line 187
    :goto_4
    const-string v4, "#createCaptureSession"

    .line 188
    .line 189
    invoke-static {v1, v2, v4}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :try_start_2
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, Lsn0;->b:Lmn0;

    .line 197
    .line 198
    iget-object v2, v3, Lea6;->X:Ljava/lang/Object;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    check-cast v2, Lyh0;

    .line 204
    .line 205
    iget-object v3, p1, Lea6;->X:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    check-cast v3, Ljava/util/Map;

    .line 211
    .line 212
    invoke-interface {v1, v2, v3, p0}, Lmn0;->a(Lyh0;Ljava/util/Map;Lsn0;)Lln0;

    .line 213
    .line 214
    .line 215
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 216
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 217
    .line 218
    .line 219
    instance-of v2, v1, Lkn0;

    .line 220
    .line 221
    if-nez v2, :cond_a

    .line 222
    .line 223
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    sget-object p0, Ldn8;->a:Ldn8;

    .line 227
    .line 228
    return-object p0

    .line 229
    :cond_a
    iget-object v2, p0, Lsn0;->k:Ljava/lang/Object;

    .line 230
    .line 231
    monitor-enter v2

    .line 232
    :try_start_3
    iget-object v3, p0, Lsn0;->u:Lon0;

    .line 233
    .line 234
    sget-object v4, Lon0;->f0:Lon0;

    .line 235
    .line 236
    if-eq v3, v4, :cond_11

    .line 237
    .line 238
    sget-object v4, Lon0;->g0:Lon0;

    .line 239
    .line 240
    if-ne v3, v4, :cond_b

    .line 241
    .line 242
    goto/16 :goto_6

    .line 243
    .line 244
    :cond_b
    sget-object v4, Lon0;->Y:Lon0;

    .line 245
    .line 246
    if-ne v3, v4, :cond_10

    .line 247
    .line 248
    sget-object v0, Lon0;->Z:Lon0;

    .line 249
    .line 250
    iput-object v0, p0, Lsn0;->u:Lon0;

    .line 251
    .line 252
    iget-object v0, p0, Lsn0;->m:Ljava/util/Map;

    .line 253
    .line 254
    iget-object v3, p1, Lea6;->X:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    check-cast v3, Ljava/util/Map;

    .line 260
    .line 261
    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 262
    .line 263
    .line 264
    iget-object v0, p0, Lsn0;->n:Ljava/util/Map;

    .line 265
    .line 266
    move-object v3, v1

    .line 267
    check-cast v3, Lkn0;

    .line 268
    .line 269
    iget-object v3, v3, Lkn0;->Y:Ljava/util/Map;

    .line 270
    .line 271
    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 272
    .line 273
    .line 274
    check-cast v1, Lkn0;

    .line 275
    .line 276
    iget-object v0, v1, Lkn0;->X:Ljava/util/Map;

    .line 277
    .line 278
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-nez v1, :cond_f

    .line 283
    .line 284
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    iget-object p1, p1, Lea6;->X:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p1, Ljava/util/Map;

    .line 290
    .line 291
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, Ljava/lang/Iterable;

    .line 296
    .line 297
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    check-cast p1, Ljava/lang/Iterable;

    .line 309
    .line 310
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    iput-object v0, p0, Lsn0;->s:Ljava/util/Map;

    .line 318
    .line 319
    iget-object p1, p0, Lsn0;->y:Ljava/util/Map;

    .line 320
    .line 321
    if-eqz p1, :cond_d

    .line 322
    .line 323
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 324
    .line 325
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_e

    .line 341
    .line 342
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    check-cast v3, Ljava/util/Map$Entry;

    .line 347
    .line 348
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_c

    .line 357
    .line 358
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    goto :goto_5

    .line 370
    :catchall_1
    move-exception p0

    .line 371
    goto :goto_7

    .line 372
    :cond_d
    move-object v1, v5

    .line 373
    :cond_e
    if-eqz v1, :cond_f

    .line 374
    .line 375
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-ne p1, v0, :cond_f

    .line 384
    .line 385
    iput-object v1, p0, Lsn0;->t:Ljava/util/LinkedHashMap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 386
    .line 387
    :cond_f
    monitor-exit v2

    .line 388
    invoke-virtual {p0, v5}, Lsn0;->i(Lgh0;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Ldn8;->a:Ldn8;

    .line 392
    .line 393
    return-object p0

    .line 394
    :cond_10
    :try_start_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    iget-object p0, p0, Lsn0;->u:Lon0;

    .line 400
    .line 401
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw p1

    .line 418
    :cond_11
    :goto_6
    invoke-virtual {p0}, Lsn0;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    iget-object p0, p0, Lsn0;->u:Lon0;

    .line 422
    .line 423
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 427
    .line 428
    monitor-exit v2

    .line 429
    return-object p0

    .line 430
    :goto_7
    monitor-exit v2

    .line 431
    throw p0

    .line 432
    :catchall_2
    move-exception p0

    .line 433
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 434
    .line 435
    .line 436
    throw p0

    .line 437
    :cond_12
    :goto_8
    :try_start_5
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 438
    .line 439
    monitor-exit v6

    .line 440
    return-object p0

    .line 441
    :goto_9
    monitor-exit v6

    .line 442
    throw p0
.end method

.method public final p(Ljava/util/Map;Ljava/util/Map;)V
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {p1}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {p2}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    move-object v0, p2

    .line 22
    check-cast v0, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lq57;->Y(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v2, p0, Lsn0;->z:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_b

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/view/Surface;

    .line 45
    .line 46
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 51
    .line 52
    if-eqz v2, :cond_8

    .line 53
    .line 54
    instance-of v3, v2, Ljava/lang/AutoCloseable;

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_0
    instance-of v3, v2, Ljava/util/concurrent/ExecutorService;

    .line 63
    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    move-object v3, v2

    .line 67
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 68
    .line 69
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-ne v3, v4, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_9

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 87
    .line 88
    :try_start_0
    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    const-wide/16 v7, 0x1

    .line 91
    .line 92
    invoke-interface {v3, v7, v8, v6}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 93
    .line 94
    .line 95
    move-result v4
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_1

    .line 97
    :catch_0
    if-nez v5, :cond_2

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    if-eqz v5, :cond_9

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    instance-of v3, v2, Landroid/content/res/TypedArray;

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    move-object v3, v2

    .line 119
    check-cast v3, Landroid/content/res/TypedArray;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    instance-of v3, v2, Landroid/media/MediaMetadataRetriever;

    .line 126
    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    move-object v3, v2

    .line 130
    check-cast v3, Landroid/media/MediaMetadataRetriever;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    instance-of v3, v2, Landroid/media/MediaDrm;

    .line 137
    .line 138
    if-eqz v3, :cond_7

    .line 139
    .line 140
    move-object v3, v2

    .line 141
    check-cast v3, Landroid/media/MediaDrm;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/media/MediaDrm;->release()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    invoke-static {}, Lkp5;->e()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    const/4 v2, 0x0

    .line 152
    :cond_9
    :goto_2
    if-eqz v2, :cond_a

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_a
    const-string p0, "Surface "

    .line 156
    .line 157
    const-string p1, " doesn\'t have a matching surface token!"

    .line 158
    .line 159
    invoke-static {p0, v1, p1}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_b
    check-cast p1, Ljava/lang/Iterable;

    .line 164
    .line 165
    invoke-static {p2, p1}, Lq57;->Y(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eqz p2, :cond_c

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    check-cast p2, Landroid/view/Surface;

    .line 184
    .line 185
    iget-object v0, p0, Lsn0;->d:Ljl0;

    .line 186
    .line 187
    invoke-virtual {v0, p2}, Ljl0;->a(Landroid/view/Surface;)Lil0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_c
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CaptureSessionState-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lsn0;->j:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
