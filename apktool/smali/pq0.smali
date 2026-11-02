.class public final Lpq0;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public g0:Ljava/lang/String;

.field public h0:Ljava/lang/String;

.field public i0:Z

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lqq0;

.field public l0:I


# direct methods
.method public constructor <init>(Lqq0;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpq0;->k0:Lqq0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iput-object p1, p0, Lpq0;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lpq0;->l0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lpq0;->l0:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, Lpq0;->k0:Lqq0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, Lqq0;->c(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltn;ZLs51;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
