.class public final Lh94;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lre6;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final X:Lg94;

.field public final Y:Lbm3;


# direct methods
.method public constructor <init>(Lg94;Lbm3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh94;->X:Lg94;

    .line 5
    .line 6
    iput-object p2, p0, Lh94;->Y:Lbm3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu76;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lh94;->X:Lg94;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lw51;->k(Lg94;Ls51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh94;->X:Lg94;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lg94;->f(Lc94;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onDestroy(Ld94;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lh94;->Y:Lbm3;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-interface {p0, p1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh94;->X:Lg94;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lg94;->a(Lc94;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
