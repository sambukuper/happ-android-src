.class public final Lp64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lqb;

.field public final b:Lf63;

.field public c:Lsa2;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Lqb;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf63;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lf63;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lp64;->b:Lf63;

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lp64;->d:I

    .line 15
    .line 16
    iput v0, p0, Lp64;->e:I

    .line 17
    .line 18
    iput-object p1, p0, Lp64;->a:Lqb;

    .line 19
    .line 20
    return-void
.end method
