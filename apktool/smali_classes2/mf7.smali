.class public final Lmf7;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ljava/io/Closeable;

.field public h0:Ljava/net/Socket;

.field public i0:Lq15;

.field public j0:I

.field public k0:I

.field public l0:J

.field public synthetic m0:Ljava/lang/Object;

.field public final synthetic n0:Lof7;

.field public o0:I


# direct methods
.method public constructor <init>(Lof7;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf7;->n0:Lof7;

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
    iput-object p1, p0, Lmf7;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lmf7;->o0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lmf7;->o0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lmf7;->n0:Lof7;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lof7;->c(Ljava/lang/String;ILs51;)Ljava/io/Serializable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
