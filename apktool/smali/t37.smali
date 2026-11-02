.class public abstract Lt37;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final m0:Lc75;

.field public static final n0:Ljn8;


# instance fields
.field public final X:Ll37;

.field public final Y:Los4;

.field public final Z:Lxd6;

.field public transient f0:Lw39;

.field public final g0:Ljn8;

.field public final h0:Lar3;

.field public final i0:Lc75;

.field public final j0:Ly66;

.field public k0:Ljava/text/DateFormat;

.field public final l0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lc75;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lc75;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt37;->m0:Lc75;

    .line 8
    .line 9
    new-instance v0, Ljn8;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    const-class v3, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v0, v3, v1, v2}, Lc75;-><init>(Ljava/lang/Class;IB)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lt37;->n0:Ljn8;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    sget-object v0, Lt37;->n0:Ljn8;

    iput-object v0, p0, Lt37;->g0:Ljn8;

    .line 104
    sget-object v0, Lc75;->f0:Lc75;

    iput-object v0, p0, Lt37;->h0:Lar3;

    .line 105
    sget-object v0, Lt37;->m0:Lc75;

    iput-object v0, p0, Lt37;->i0:Lc75;

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lt37;->X:Ll37;

    .line 107
    iput-object v0, p0, Lt37;->Y:Los4;

    .line 108
    new-instance v1, Lxd6;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lxd6;-><init>(B)V

    iput-object v1, p0, Lt37;->Z:Lxd6;

    .line 109
    iput-object v0, p0, Lt37;->j0:Ly66;

    .line 110
    iput-object v0, p0, Lt37;->f0:Lw39;

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Lt37;->l0:Z

    return-void
.end method

.method public constructor <init>(Lt37;Ll37;Los4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lt37;->n0:Ljn8;

    .line 5
    .line 6
    iput-object v0, p0, Lt37;->g0:Ljn8;

    .line 7
    .line 8
    sget-object v0, Lc75;->f0:Lc75;

    .line 9
    .line 10
    iput-object v0, p0, Lt37;->h0:Lar3;

    .line 11
    .line 12
    sget-object v0, Lt37;->m0:Lc75;

    .line 13
    .line 14
    iput-object v0, p0, Lt37;->i0:Lc75;

    .line 15
    .line 16
    iput-object p3, p0, Lt37;->Y:Los4;

    .line 17
    .line 18
    iput-object p2, p0, Lt37;->X:Ll37;

    .line 19
    .line 20
    iget-object p3, p1, Lt37;->Z:Lxd6;

    .line 21
    .line 22
    iput-object p3, p0, Lt37;->Z:Lxd6;

    .line 23
    .line 24
    iget-object v1, p1, Lt37;->g0:Ljn8;

    .line 25
    .line 26
    iput-object v1, p0, Lt37;->g0:Ljn8;

    .line 27
    .line 28
    iget-object v1, p1, Lt37;->h0:Lar3;

    .line 29
    .line 30
    iput-object v1, p0, Lt37;->h0:Lar3;

    .line 31
    .line 32
    iget-object p1, p1, Lt37;->i0:Lc75;

    .line 33
    .line 34
    iput-object p1, p0, Lt37;->i0:Lc75;

    .line 35
    .line 36
    if-ne v1, v0, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    :goto_0
    iput-boolean p1, p0, Lt37;->l0:Z

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p1, p2, Lwp4;->g0:Lw39;

    .line 47
    .line 48
    iput-object p1, p0, Lt37;->f0:Lw39;

    .line 49
    .line 50
    iget-object p1, p3, Lxd6;->Z:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ly66;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    monitor-enter p3

    .line 64
    :try_start_0
    iget-object p1, p3, Lxd6;->Z:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ly66;

    .line 73
    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    iget-object p1, p3, Lxd6;->Y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lc24;

    .line 79
    .line 80
    new-instance p2, Ly66;

    .line 81
    .line 82
    invoke-direct {p2, p1}, Ly66;-><init>(Lc24;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p3, Lxd6;->Z:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    move-object p1, p2

    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    goto :goto_3

    .line 96
    :cond_2
    :goto_1
    monitor-exit p3

    .line 97
    :goto_2
    iput-object p1, p0, Lt37;->j0:Ly66;

    .line 98
    .line 99
    return-void

    .line 100
    :goto_3
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Lqf1;

    .line 2
    .line 3
    iget-object p0, p0, Lqf1;->q0:Leq2;

    .line 4
    .line 5
    new-instance v0, Lnh3;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw v0
.end method

.method public final varargs B(Lz20;Le50;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    array-length v0, p4

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    :cond_0
    invoke-virtual {p2}, Le50;->j()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    const/16 v0, 0x1f4

    .line 19
    .line 20
    if-gt p4, v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "]...["

    .line 34
    .line 35
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int/2addr v1, v0

    .line 43
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :goto_0
    const-string p4, "\""

    .line 55
    .line 56
    invoke-static {p4, p2, p4}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p2, "[N/A]"

    .line 62
    .line 63
    :goto_1
    iget-object p1, p1, Lz20;->a:Ldh8;

    .line 64
    .line 65
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {p1}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p4, " (of type "

    .line 72
    .line 73
    const-string v0, "): "

    .line 74
    .line 75
    const-string v1, "Invalid definition for property "

    .line 76
    .line 77
    invoke-static {v1, p2, p4, p1, v0}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p0, Lqf1;

    .line 89
    .line 90
    iget-object p0, p0, Lqf1;->q0:Leq2;

    .line 91
    .line 92
    new-instance p2, Lnh3;

    .line 93
    .line 94
    invoke-direct {p2, p0, p1}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p2
.end method

.method public final varargs C(Lz20;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lz20;->a:Ldh8;

    .line 2
    .line 3
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {p1}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    array-length v0, p3

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    const-string p3, "Invalid type definition for type "

    .line 17
    .line 18
    const-string v0, ": "

    .line 19
    .line 20
    invoke-static {p3, p1, v0, p2}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p0, Lqf1;

    .line 25
    .line 26
    iget-object p0, p0, Lqf1;->q0:Leq2;

    .line 27
    .line 28
    new-instance p2, Lnh3;

    .line 29
    .line 30
    invoke-direct {p2, p0, p1}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p2
.end method

.method public abstract D(Lvj8;Ljava/lang/Object;)Lar3;
.end method

.method public final a(Ldh8;)Lar3;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lt37;->c(Ldh8;)Lar3;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lt37;->Z:Lxd6;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_1
    iget-object v2, v1, Lxd6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lc24;

    .line 13
    .line 14
    new-instance v3, Ldi8;

    .line 15
    .line 16
    invoke-direct {v3, p1}, Ldi8;-><init>(Ldh8;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v2, Lc24;->X:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast p1, Lwu5;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {p1, v3, v0, v2}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, v1, Lxd6;->Z:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    instance-of p1, v0, Lh50;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    move-object p1, v0

    .line 46
    check-cast p1, Lh50;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lh50;->t(Lt37;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    monitor-exit v1

    .line 52
    return-object v0

    .line 53
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0

    .line 55
    :cond_2
    return-object v0

    .line 56
    :catch_0
    move-exception p1

    .line 57
    invoke-static {p1}, Lit0;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast p0, Lqf1;

    .line 62
    .line 63
    iget-object p0, p0, Lqf1;->q0:Leq2;

    .line 64
    .line 65
    new-instance v1, Lpp3;

    .line 66
    .line 67
    invoke-direct {v1, p0, v0, p1}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v1
.end method

.method public final b(Ljava/lang/Class;)Lar3;
    .locals 7

    .line 1
    iget-object v0, p0, Lt37;->X:Ll37;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0, v0}, Lt37;->c(Ldh8;)Lar3;

    .line 9
    .line 10
    .line 11
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget-object v3, p0, Lt37;->Z:Lxd6;

    .line 15
    .line 16
    monitor-enter v3

    .line 17
    :try_start_1
    iget-object v4, v3, Lxd6;->Y:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lc24;

    .line 20
    .line 21
    new-instance v5, Ldi8;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct {v5, p1, v6}, Ldi8;-><init>(Ljava/lang/Class;Z)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v4, Lc24;->X:Ljava/io/Serializable;

    .line 28
    .line 29
    check-cast p1, Lwu5;

    .line 30
    .line 31
    invoke-virtual {p1, v5, v2, v6}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v4, v3, Lxd6;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Lc24;

    .line 38
    .line 39
    new-instance v5, Ldi8;

    .line 40
    .line 41
    invoke-direct {v5, v0}, Ldi8;-><init>(Ldh8;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v4, Lc24;->X:Ljava/io/Serializable;

    .line 45
    .line 46
    check-cast v0, Lwu5;

    .line 47
    .line 48
    invoke-virtual {v0, v5, v2, v6}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    :cond_0
    iget-object p1, v3, Lxd6;->Z:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    instance-of p1, v2, Lh50;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    move-object p1, v2

    .line 68
    check-cast p1, Lh50;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lh50;->t(Lt37;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    :goto_0
    monitor-exit v3

    .line 77
    return-object v2

    .line 78
    :goto_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw p0

    .line 80
    :cond_3
    return-object v2

    .line 81
    :catch_0
    move-exception p1

    .line 82
    invoke-static {p1}, Lit0;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Lt37;->A(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    throw v1
.end method

.method public final c(Ldh8;)Lar3;
    .locals 7

    .line 1
    iget-object v0, p0, Lt37;->Y:Los4;

    .line 2
    .line 3
    check-cast v0, Lj50;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lt37;->X:Ll37;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ll37;->i(Ldh8;)Lz20;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, v2, Lz20;->e:Lal;

    .line 15
    .line 16
    invoke-static {p0, v3}, Lf30;->Z(Lt37;Lvj8;)Lar3;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    invoke-virtual {v1}, Lvp4;->d()Lm85;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    :try_start_0
    invoke-virtual {v4, v1, v3, p1}, Lm85;->a0(Lvp4;Lvj8;Ldh8;)Ldh8;

    .line 30
    .line 31
    .line 32
    move-result-object v3
    :try_end_0
    .catch Lpp3; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    if-ne v3, p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 v6, 0x1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ll37;->i(Ldh8;)Lz20;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    :goto_0
    iget-object p1, v2, Lz20;->d:Lm85;

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    iget-object v1, v2, Lz20;->e:Lal;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lm85;->E(Lvj8;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v1, v2, Lz20;->c:Lvp4;

    .line 61
    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    check-cast p1, Ljava/lang/Class;

    .line 66
    .line 67
    const-class v4, Lz51;

    .line 68
    .line 69
    if-eq p1, v4, :cond_8

    .line 70
    .line 71
    invoke-static {p1}, Lit0;->p(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    const-class v4, La61;

    .line 79
    .line 80
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_7

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v4, Lxp4;->q0:Lxp4;

    .line 90
    .line 91
    invoke-virtual {v1, v4}, Lvp4;->f(Lxp4;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {p1, v1}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 103
    .line 104
    .line 105
    return-object v5

    .line 106
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const-string p1, "; expected Class<Converter>"

    .line 111
    .line 112
    const-string v0, "AnnotationIntrospector returned Class "

    .line 113
    .line 114
    invoke-static {v0, p0, p1}, Lom0;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-object v5

    .line 118
    :cond_8
    :goto_1
    invoke-virtual {v0, p0, v3, v2, v6}, Lj50;->b0(Lt37;Ldh8;Lz20;Z)Lar3;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :catch_0
    move-exception p1

    .line 124
    invoke-virtual {p1}, Lpp3;->c()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-array v0, v6, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {p0, v2, p1, v0}, Lt37;->C(Lz20;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    throw v5
.end method

.method public final d()Ljava/text/DateFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lt37;->k0:Ljava/text/DateFormat;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lt37;->X:Ll37;

    .line 7
    .line 8
    iget-object v0, v0, Lvp4;->Y:Ll20;

    .line 9
    .line 10
    iget-object v0, v0, Ll20;->g0:Ljava/text/DateFormat;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/text/DateFormat;->clone()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/text/DateFormat;

    .line 17
    .line 18
    iput-object v0, p0, Lt37;->k0:Ljava/text/DateFormat;

    .line 19
    .line 20
    return-object v0
.end method

.method public final e(Ldh8;Ljava/lang/Class;)Ldh8;
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p0, p0, Lt37;->X:Ll37;

    .line 9
    .line 10
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 11
    .line 12
    iget-object p0, p0, Ll20;->X:Luh8;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, p1, p2, v0}, Luh8;->g(Ldh8;Ljava/lang/Class;Z)Ldh8;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Class;

    .line 6
    .line 7
    const-class v0, Lz51;

    .line 8
    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    invoke-static {p1}, Lit0;->p(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-class v0, La61;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lt37;->X:Ll37;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lxp4;->q0:Lxp4;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lvp4;->f(Lxp4;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p1, p0}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "; expected Class<Converter>"

    .line 53
    .line 54
    const-string v0, "AnnotationIntrospector returned Class "

    .line 55
    .line 56
    invoke-static {v0, p0, p1}, Lom0;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    return-void

    .line 60
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string p1, "; expected type Converter or Class<Converter> instead"

    .line 69
    .line 70
    const-string v0, "AnnotationIntrospector returned Converter definition of type "

    .line 71
    .line 72
    invoke-static {v0, p0, p1}, Lom0;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/Object;Lro3;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p1}, Lro3;->U(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_1

    .line 5
    .line 6
    iget-boolean p1, p0, Lt37;->l0:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p3}, Lro3;->X()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lt37;->h0:Lar3;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-virtual {p1, p2, p3, p0}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lt37;->o(Ljava/lang/Class;)Lar3;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p2, p3, p0}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final h(Lro3;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt37;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lro3;->X()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lt37;->h0:Lar3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, p1, p0}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i(Ldh8;Ld50;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly66;->a(Ldh8;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lxd6;->M(Ldh8;)Lar3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lt37;->a(Ldh8;)Lar3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0, v0, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final j(Ljava/lang/Class;Ld50;)Lar3;
    .locals 2

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly66;->b(Ljava/lang/Class;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lxd6;->N(Ljava/lang/Class;)Lar3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lt37;->X:Ll37;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lxd6;->M(Ldh8;)Lar3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lt37;->b(Ljava/lang/Class;)Lar3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    move-object v0, v1

    .line 41
    :cond_1
    invoke-virtual {p0, v0, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public final k(Ldh8;Ld50;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Lt37;->Y:Los4;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Los4;->l(Lt37;Ldh8;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Lh50;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lh50;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lh50;->t(Lt37;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public abstract l(Ljava/lang/Object;Lex5;)Lp59;
.end method

.method public final m(Ldh8;Ld50;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly66;->a(Ldh8;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lxd6;->M(Ldh8;)Lar3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lt37;->a(Ldh8;)Lar3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0, v0, p2}, Lt37;->u(Lar3;Ld50;)Lar3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final n(Ljava/lang/Class;Ld50;)Lar3;
    .locals 2

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly66;->b(Ljava/lang/Class;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lxd6;->N(Ljava/lang/Class;)Lar3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lt37;->X:Ll37;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lxd6;->M(Ldh8;)Lar3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lt37;->b(Ljava/lang/Class;)Lar3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    move-object v0, v1

    .line 41
    :cond_1
    invoke-virtual {p0, v0, p2}, Lt37;->u(Lar3;Ld50;)Lar3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public final o(Ljava/lang/Class;)Lar3;
    .locals 6

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    iget-object v1, v0, Ly66;->a:[Lwg;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    add-int/2addr v2, v3

    .line 15
    iget v0, v0, Ly66;->b:I

    .line 16
    .line 17
    and-int/2addr v0, v2

    .line 18
    aget-object v0, v1, v0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v2, v0, Lwg;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljava/lang/Class;

    .line 28
    .line 29
    if-ne v2, p1, :cond_2

    .line 30
    .line 31
    iget-boolean v2, v0, Lwg;->a:Z

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lwg;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lar3;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v0, v0, Lwg;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lwg;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object v2, v0, Lwg;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Class;

    .line 49
    .line 50
    if-ne v2, p1, :cond_2

    .line 51
    .line 52
    iget-boolean v2, v0, Lwg;->a:Z

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Lwg;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lar3;

    .line 59
    .line 60
    :goto_0
    if-eqz v0, :cond_3

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 64
    .line 65
    monitor-enter v0

    .line 66
    :try_start_0
    iget-object v2, v0, Lxd6;->Y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lc24;

    .line 69
    .line 70
    new-instance v4, Ldi8;

    .line 71
    .line 72
    invoke-direct {v4, p1, v3}, Ldi8;-><init>(Ljava/lang/Class;Z)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v2, Lc24;->X:Ljava/io/Serializable;

    .line 76
    .line 77
    check-cast v2, Lwu5;

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Lwu5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lar3;

    .line 84
    .line 85
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_4
    invoke-virtual {p0, p1, v1}, Lt37;->q(Ljava/lang/Class;Ld50;)Lar3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v2, p0, Lt37;->Y:Los4;

    .line 94
    .line 95
    iget-object v4, p0, Lt37;->X:Ll37;

    .line 96
    .line 97
    invoke-virtual {v4, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v2, v4, v5}, Los4;->m(Ll37;Ldh8;)Lsi8;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eqz v2, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2, v1}, Lri8;->a(Ld50;)Lri8;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v4, Lfj8;

    .line 112
    .line 113
    invoke-direct {v4, v2, v0}, Lfj8;-><init>(Lri8;Lar3;)V

    .line 114
    .line 115
    .line 116
    move-object v0, v4

    .line 117
    :cond_5
    iget-object p0, p0, Lt37;->Z:Lxd6;

    .line 118
    .line 119
    monitor-enter p0

    .line 120
    :try_start_1
    iget-object v2, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Lc24;

    .line 123
    .line 124
    new-instance v4, Ldi8;

    .line 125
    .line 126
    invoke-direct {v4, p1, v3}, Ldi8;-><init>(Ljava/lang/Class;Z)V

    .line 127
    .line 128
    .line 129
    iget-object p1, v2, Lc24;->X:Ljava/io/Serializable;

    .line 130
    .line 131
    check-cast p1, Lwu5;

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    invoke-virtual {p1, v4, v0, v2}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-nez p1, :cond_6

    .line 139
    .line 140
    iget-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    goto :goto_2

    .line 150
    :cond_6
    :goto_1
    monitor-exit p0

    .line 151
    return-object v0

    .line 152
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    throw p1

    .line 154
    :catchall_1
    move-exception p0

    .line 155
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    throw p0
.end method

.method public final p(Ldh8;Ld50;)Lar3;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ly66;->a(Ldh8;)Lar3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lxd6;->M(Ldh8;)Lar3;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lt37;->a(Ldh8;)Lar3;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    invoke-virtual {p0, v0, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    check-cast p0, Lqf1;

    .line 38
    .line 39
    iget-object p0, p0, Lqf1;->q0:Leq2;

    .line 40
    .line 41
    new-instance p1, Lpp3;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    const-string v0, "Null passed for `valueType` of `findValueSerializer()`"

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, p2}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public final q(Ljava/lang/Class;Ld50;)Lar3;
    .locals 2

    .line 1
    iget-object v0, p0, Lt37;->j0:Ly66;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly66;->b(Ljava/lang/Class;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lt37;->Z:Lxd6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lxd6;->N(Ljava/lang/Class;)Lar3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lt37;->X:Ll37;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lxd6;->M(Ldh8;)Lar3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lt37;->b(Ljava/lang/Class;)Lar3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    move-object v0, v1

    .line 41
    :cond_1
    invoke-virtual {p0, v0, p2}, Lt37;->v(Lar3;Ld50;)Lar3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lt37;->f0:Lw39;

    .line 2
    .line 3
    check-cast p0, Le51;

    .line 4
    .line 5
    iget-object p0, p0, Le51;->i0:Ljava/util/HashMap;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    sget-object p1, Le51;->k0:Ljava/lang/Object;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final s()Luh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lt37;->X:Ll37;

    .line 2
    .line 3
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 4
    .line 5
    iget-object p0, p0, Ll20;->X:Luh8;

    .line 6
    .line 7
    return-object p0
.end method

.method public final t(Ljava/lang/Class;)Lar3;
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lt37;->g0:Ljn8;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljn8;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-direct {p0, p1, v0, v1}, Lc75;-><init>(Ljava/lang/Class;IB)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final u(Lar3;Ld50;)Lar3;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p1, Lp51;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lp51;

    .line 8
    .line 9
    invoke-interface {p1, p0, p2}, Lp51;->a(Lt37;Ld50;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object p1
.end method

.method public final v(Lar3;Ld50;)Lar3;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p1, Lp51;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lp51;

    .line 8
    .line 9
    invoke-interface {p1, p0, p2}, Lp51;->a(Lt37;Ld50;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object p1
.end method

.method public w(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object p0, p0, Lt37;->X:Ll37;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lxp4;->q0:Lxp4;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lvp4;->f(Lxp4;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p1, p0}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public abstract x(Ljava/lang/Object;)Z
.end method

.method public final y(Lf85;)Lex5;
    .locals 2

    .line 1
    iget-object v0, p1, Lf85;->b:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object p0, p0, Lt37;->X:Ll37;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lxp4;->q0:Lxp4;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lvp4;->f(Lxp4;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {v0, p0}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ld85;

    .line 19
    .line 20
    iget-object p1, p1, Lf85;->d:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p0, Lex5;

    .line 23
    .line 24
    iget-object v0, p0, Lex5;->X:Ljava/lang/Class;

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    new-instance v0, Lex5;

    .line 30
    .line 31
    iget-object p0, p0, Lex5;->Y:Lf50;

    .line 32
    .line 33
    invoke-direct {v0, p1, p0}, Lex5;-><init>(Ljava/lang/Class;Lf50;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lt37;->s()Luh8;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Luh8;->f0:Lgh8;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1, v2}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p2}, Lt37;->A(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    throw v0
.end method
