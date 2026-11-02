.class public final Lrk4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public final synthetic h0:Z

.field public final synthetic i0:Z


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZZLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 2
    .line 3
    iput-boolean p2, p0, Lrk4;->h0:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lrk4;->i0:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lrk4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrk4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lrk4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance p2, Lrk4;

    .line 2
    .line 3
    iget-boolean v0, p0, Lrk4;->h0:Z

    .line 4
    .line 5
    iget-boolean v1, p0, Lrk4;->i0:Z

    .line 6
    .line 7
    iget-object p0, p0, Lrk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lrk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZZLq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lrk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 5
    .line 6
    iget-object v0, p1, Lsu/happ/proxyutility/feature/main/MainActivity;->k1:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    .line 11
    .line 12
    sget-object v0, Lko1;->B1:Lm51;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lkm4;->x(Lml2;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x5

    .line 25
    const/4 v3, 0x0

    .line 26
    sget-object v4, Lr83;->a:Lr83;

    .line 27
    .line 28
    invoke-direct {v0, v3, v4, v1, v2}, Lsu/happ/proxyutility/dto/ImportResult;-><init>(ILx83;Lt83;I)V

    .line 29
    .line 30
    .line 31
    iget-boolean v1, p0, Lrk4;->h0:Z

    .line 32
    .line 33
    iget-boolean p0, p0, Lrk4;->i0:Z

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
