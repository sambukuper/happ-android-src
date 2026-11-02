.class public final Lba2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public g0:Ljava/io/FileOutputStream;

.field public h0:Ljava/io/FileOutputStream;

.field public i0:Z

.field public final synthetic j0:Lca2;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lca2;Ljava/lang/Object;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lba2;->j0:Lca2;

    .line 2
    .line 3
    iput-object p2, p0, Lba2;->k0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq51;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lba2;->m(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lba2;

    .line 8
    .line 9
    sget-object p1, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lba2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final m(Lq51;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Lba2;

    .line 2
    .line 3
    iget-object v1, p0, Lba2;->j0:Lca2;

    .line 4
    .line 5
    iget-object p0, p0, Lba2;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lba2;-><init>(Lca2;Ljava/lang/Object;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lba2;->j0:Lca2;

    .line 2
    .line 3
    iget-object v0, v0, Lk92;->a:Ljava/io/File;

    .line 4
    .line 5
    iget-boolean v1, p0, Lba2;->i0:Z

    .line 6
    .line 7
    sget-object v2, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lba2;->h0:Ljava/io/FileOutputStream;

    .line 16
    .line 17
    iget-object p0, p0, Lba2;->g0:Ljava/io/FileOutputStream;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lba2;->k0:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    :try_start_2
    new-instance v5, Ltl8;

    .line 42
    .line 43
    invoke-direct {v5, v1}, Ltl8;-><init>(Ljava/io/FileOutputStream;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lba2;->g0:Ljava/io/FileOutputStream;

    .line 47
    .line 48
    iput-object v1, p0, Lba2;->h0:Ljava/io/FileOutputStream;

    .line 49
    .line 50
    iput-boolean v3, p0, Lba2;->i0:Z

    .line 51
    .line 52
    invoke-static {p1, v5}, Lqe4;->R0(Ljava/lang/Object;Ltl8;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    .line 55
    sget-object p0, Lc71;->X:Lc71;

    .line 56
    .line 57
    if-ne v2, p0, :cond_2

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_2
    move-object p0, v1

    .line 61
    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_4
    invoke-static {p0, v4}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :catch_0
    move-exception p0

    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    move-object p0, v1

    .line 76
    :goto_1
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 77
    :catchall_2
    move-exception v1

    .line 78
    :try_start_6
    invoke-static {p0, p1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 82
    :goto_2
    instance-of p1, p0, Ljava/io/FileNotFoundException;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p0, Ljava/io/FileNotFoundException;

    .line 91
    .line 92
    invoke-static {p1, p0}, Los4;->W(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :cond_3
    throw p0
.end method
