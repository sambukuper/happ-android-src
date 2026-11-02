.class public final Lqn4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lq51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainViewModel;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqn4;->h0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p4, p0, Lqn4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lqn4;->j0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

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
    invoke-virtual {p0, p2, p1}, Lqn4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lqn4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lqn4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lqn4;

    .line 2
    .line 3
    iget-object v1, p0, Lqn4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lqn4;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lqn4;->h0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, p1, p0, v2, v1}, Lqn4;-><init>(Lq51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainViewModel;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lqn4;->g0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lqn4;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb71;

    .line 4
    .line 5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lof7;->a:Lof7;

    .line 9
    .line 10
    new-instance p1, Lon4;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, Lqn4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 14
    .line 15
    iget-object v3, p0, Lqn4;->j0:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p1, v0, v2, v3, v1}, Lon4;-><init>(Lb71;Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/lang/String;B)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lqn4;->h0:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lof7;->b(Ljava/lang/String;Lgn2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ldn8;->a:Ldn8;

    .line 26
    .line 27
    return-object p0
.end method
