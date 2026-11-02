.class public final Llw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Lrn2;

.field public final synthetic h0:Le15;

.field public final synthetic i0:Lrn2;


# direct methods
.method public constructor <init>(ILzy0;Lzy0;Lrn2;Lrn2;Le15;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Llw6;->X:B

    .line 5
    .line 6
    iput-object p2, p0, Llw6;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Llw6;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Llw6;->f0:Lrn2;

    .line 11
    .line 12
    iput-object p5, p0, Llw6;->g0:Lrn2;

    .line 13
    .line 14
    iput-object p6, p0, Llw6;->h0:Le15;

    .line 15
    .line 16
    iput-object p7, p0, Llw6;->i0:Lrn2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    move p2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    and-int/2addr p1, v1

    .line 20
    invoke-virtual {v7, p1, p2}, Llp2;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v6, p0, Llw6;->i0:Lrn2;

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    iget-byte v0, p0, Llw6;->X:B

    .line 30
    .line 31
    iget-object v1, p0, Llw6;->Y:Lzy0;

    .line 32
    .line 33
    iget-object v2, p0, Llw6;->Z:Lzy0;

    .line 34
    .line 35
    iget-object v3, p0, Llw6;->f0:Lrn2;

    .line 36
    .line 37
    iget-object v4, p0, Llw6;->g0:Lrn2;

    .line 38
    .line 39
    iget-object v5, p0, Llw6;->h0:Le15;

    .line 40
    .line 41
    invoke-static/range {v0 .. v8}, Lwl7;->j(ILzy0;Lzy0;Lrn2;Lrn2;Lv09;Lrn2;Llp2;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v7}, Llp2;->Q()V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 49
    .line 50
    return-object p0
.end method
