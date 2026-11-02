.class public final Ls98;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lb71;

.field public final b:Lb71;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lu61;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lu61;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lu61;

.field public final i:Lvz7;

.field public final j:Lvz7;


# direct methods
.method public constructor <init>(Lb71;Lb71;Ljava/util/concurrent/Executor;Lu61;Ljava/util/concurrent/Executor;Lu61;Ljava/util/concurrent/Executor;Lu61;Ldn2;Lf98;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ls98;->a:Lb71;

    .line 11
    .line 12
    iput-object p2, p0, Ls98;->b:Lb71;

    .line 13
    .line 14
    iput-object p3, p0, Ls98;->c:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iput-object p4, p0, Ls98;->d:Lu61;

    .line 17
    .line 18
    iput-object p5, p0, Ls98;->e:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iput-object p6, p0, Ls98;->f:Lu61;

    .line 21
    .line 22
    iput-object p7, p0, Ls98;->g:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    iput-object p8, p0, Ls98;->h:Lu61;

    .line 25
    .line 26
    new-instance p1, Lmv2;

    .line 27
    .line 28
    const/4 p2, 0x5

    .line 29
    invoke-direct {p1, p9, p2}, Lmv2;-><init>(Ldn2;B)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lvz7;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Ls98;->i:Lvz7;

    .line 38
    .line 39
    new-instance p1, Lv38;

    .line 40
    .line 41
    const/4 p2, 0x6

    .line 42
    invoke-direct {p1, p10, p2}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Lvz7;

    .line 46
    .line 47
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Ls98;->j:Lvz7;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Ls98;->i:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b(JLgn2;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Ls98;->d:Lu61;

    .line 2
    .line 3
    new-instance v1, Lr98;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-wide v4, p1

    .line 8
    move-object v3, p3

    .line 9
    invoke-direct/range {v1 .. v6}, Lr98;-><init>(Ls98;Lgn2;JLq51;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method
