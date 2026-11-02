.class public final Lxc5;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Laq7;

.field public final h0:I

.field public i0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Laq7;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Laq7;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxc5;->g0:Laq7;

    .line 5
    .line 6
    iput p2, p0, Lxc5;->h0:I

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Laq7;->e(J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxc5;->i0:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lxc5;->g0:Laq7;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lu85;->onNext(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p0}, Lu85;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lxc5;->i0:Ljava/util/ArrayList;

    .line 3
    .line 4
    iget-object p0, p0, Lxc5;->g0:Laq7;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxc5;->i0:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lxc5;->h0:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxc5;->i0:Ljava/util/ArrayList;

    .line 13
    .line 14
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ne p1, v1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lxc5;->i0:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object p0, p0, Lxc5;->g0:Laq7;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Lu85;->onNext(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method
