.class public final Lm60;
.super Le1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Ljava/lang/Thread;

.field public final h0:Ld42;


# direct methods
.method public constructor <init>(Ls61;Ljava/lang/Thread;Ld42;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Le1;-><init>(Ls61;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lm60;->g0:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lm60;->h0:Ld42;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lm60;->g0:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
