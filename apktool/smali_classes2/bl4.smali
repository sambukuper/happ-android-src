.class public final Lbl4;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public h0:I


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbl4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lbl4;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lbl4;->h0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lbl4;->h0:I

    .line 9
    .line 10
    sget p1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 11
    .line 12
    iget-object p1, p0, Lbl4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->Y(Ls51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
