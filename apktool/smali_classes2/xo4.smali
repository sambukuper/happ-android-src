.class public final Lxo4;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Lsu/happ/proxyutility/dto/enums/EPingType;

.field public h0:Lq15;

.field public i0:Z

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lsu/happ/proxyutility/feature/main/MainViewModel;

.field public l0:I


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxo4;->k0:Lsu/happ/proxyutility/feature/main/MainViewModel;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lxo4;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lxo4;->l0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lxo4;->l0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lxo4;->k0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p1, v0, p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->N(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EPingType;ZLs51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
