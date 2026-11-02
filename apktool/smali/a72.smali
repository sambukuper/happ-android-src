.class public final La72;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Le72;

.field public g0:Lokhttp3/Response;

.field public h0:Z

.field public i0:I

.field public j0:J

.field public synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Le72;

.field public m0:I


# direct methods
.method public constructor <init>(Le72;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, La72;->l0:Le72;

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
    iput-object p1, p0, La72;->k0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La72;->m0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La72;->m0:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La72;->l0:Le72;

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
    invoke-static/range {v0 .. v7}, Le72;->d(Le72;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLdn2;Ls51;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lc71;->X:Lc71;

    .line 24
    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    new-instance p1, Lsj6;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method
