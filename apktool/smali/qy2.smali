.class public final synthetic Lqy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Lb83;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:I

.field public final synthetic g0:Ltn2;

.field public final synthetic h0:S

.field public final synthetic i0:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lb83;Lkx4;ILtn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqy2;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lqy2;->Y:Lb83;

    .line 7
    .line 8
    iput-object p3, p0, Lqy2;->Z:Lkx4;

    .line 9
    .line 10
    iput p4, p0, Lqy2;->f0:I

    .line 11
    .line 12
    iput-object p5, p0, Lqy2;->g0:Ltn2;

    .line 13
    .line 14
    iput-short p6, p0, Lqy2;->h0:S

    .line 15
    .line 16
    iput-byte p7, p0, Lqy2;->i0:B

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, Lqy2;->h0:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Lqy2;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lqy2;->Y:Lb83;

    .line 20
    .line 21
    iget-object v2, p0, Lqy2;->Z:Lkx4;

    .line 22
    .line 23
    iget v3, p0, Lqy2;->f0:I

    .line 24
    .line 25
    iget-object v4, p0, Lqy2;->g0:Ltn2;

    .line 26
    .line 27
    iget-byte v7, p0, Lqy2;->i0:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, Lys0;->g(Ljava/lang/String;Lb83;Lkx4;ILtn2;Llp2;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Ldn8;->a:Ldn8;

    .line 33
    .line 34
    return-object p0
.end method
