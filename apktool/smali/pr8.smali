.class public final Lpr8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lm51;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lc37;

.field public final d:Ljava/lang/ThreadLocal;

.field public final e:Lob;

.field public final f:Lm51;


# direct methods
.method public constructor <init>(Lm51;Ljava/util/concurrent/Executor;Lu61;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpr8;->a:Lm51;

    .line 8
    .line 9
    iput-object p2, p0, Lpr8;->b:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    new-instance p3, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, Lc37;

    .line 21
    .line 22
    invoke-direct {p3, p2}, Lc37;-><init>(Ljava/util/concurrent/Executor;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lpr8;->c:Lc37;

    .line 26
    .line 27
    new-instance p2, Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lpr8;->d:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    new-instance p2, Lob;

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    invoke-direct {p2, p0, p3}, Lob;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lpr8;->e:Lob;

    .line 41
    .line 42
    invoke-static {p2}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-object p1, p1, Lm51;->Y:Ls61;

    .line 47
    .line 48
    invoke-static {}, Lpw7;->b()Low7;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-interface {p1, p3}, Ls61;->B0(Ls61;)Ls61;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1, p2}, Ls61;->B0(Ls61;)Ls61;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lgv3;->c(Ls61;)Lm51;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lpr8;->f:Lm51;

    .line 65
    .line 66
    return-void
.end method
