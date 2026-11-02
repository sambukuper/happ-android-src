.class public final Llq1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final X:Lxe2;

.field public final Y:Lgn2;

.field public final Z:Lrn2;


# direct methods
.method public constructor <init>(Lxe2;Lgn2;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llq1;->X:Lxe2;

    .line 5
    .line 6
    iput-object p2, p0, Llq1;->Y:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Llq1;->Z:Lrn2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lea6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ld75;->a:Lz31;

    .line 7
    .line 8
    iput-object v1, v0, Lea6;->X:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lzj;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v0, p1, v2}, Lzj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Llq1;->X:Lxe2;

    .line 17
    .line 18
    invoke-interface {p0, v1, p2}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lc71;->X:Lc71;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 28
    .line 29
    return-object p0
.end method
