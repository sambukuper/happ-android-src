.class public final Lis5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Llr5;

.field public final c:Lgn2;

.field public final d:Lb71;

.field public final e:Ljava/lang/Object;

.field public volatile f:Ly45;


# direct methods
.method public constructor <init>(Ljava/lang/String;Llr5;Lgn2;Lb71;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lis5;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lis5;->b:Llr5;

    .line 7
    .line 8
    iput-object p3, p0, Lis5;->c:Lgn2;

    .line 9
    .line 10
    iput-object p4, p0, Lis5;->d:Lb71;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lis5;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p2, Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lis5;->f:Ly45;

    .line 7
    .line 8
    if-nez p1, :cond_2

    .line 9
    .line 10
    iget-object p1, p0, Lis5;->e:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    :try_start_0
    iget-object v0, p0, Lis5;->f:Ly45;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v0, p0, Lis5;->b:Llr5;

    .line 22
    .line 23
    iget-object v1, p0, Lis5;->c:Lgn2;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, p2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/List;

    .line 33
    .line 34
    iget-object v2, p0, Lis5;->d:Lb71;

    .line 35
    .line 36
    new-instance v3, La23;

    .line 37
    .line 38
    const/16 v4, 0xc

    .line 39
    .line 40
    invoke-direct {v3, p2, p0, v4}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p2, Lm92;

    .line 47
    .line 48
    new-instance v4, Lhr5;

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    invoke-direct {v4, v3, v5}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, v4}, Lm92;-><init>(Lhr5;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Ly45;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Lk42;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    :goto_0
    new-instance v4, Lq0;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/16 v6, 0x11

    .line 71
    .line 72
    invoke-direct {v4, v1, v5, v6}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v4, Lib1;

    .line 80
    .line 81
    invoke-direct {v4, p2, v1, v0, v2}, Lib1;-><init>(Lm92;Ljava/util/List;Lk71;Lb71;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v3, v4}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance p2, Ly45;

    .line 88
    .line 89
    invoke-direct {p2, v3}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lis5;->f:Ly45;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    :goto_1
    iget-object p0, p0, Lis5;->f:Ly45;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    monitor-exit p1

    .line 103
    return-object p0

    .line 104
    :goto_2
    monitor-exit p1

    .line 105
    throw p0

    .line 106
    :cond_2
    return-object p1
.end method
