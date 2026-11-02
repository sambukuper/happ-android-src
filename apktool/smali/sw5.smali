.class public final synthetic Lsw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:J

.field public final synthetic Z:F

.field public final synthetic f0:J

.field public final synthetic g0:Z

.field public final synthetic h0:F


# direct methods
.method public synthetic constructor <init>(Lkx4;JFJIFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsw5;->X:Lkx4;

    .line 5
    .line 6
    iput-wide p2, p0, Lsw5;->Y:J

    .line 7
    .line 8
    iput p4, p0, Lsw5;->Z:F

    .line 9
    .line 10
    iput-wide p5, p0, Lsw5;->f0:J

    .line 11
    .line 12
    iput-boolean p7, p0, Lsw5;->g0:Z

    .line 13
    .line 14
    iput p8, p0, Lsw5;->h0:F

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lw79;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    iget-object v0, p0, Lsw5;->X:Lkx4;

    .line 15
    .line 16
    iget-wide v1, p0, Lsw5;->Y:J

    .line 17
    .line 18
    iget v3, p0, Lsw5;->Z:F

    .line 19
    .line 20
    iget-wide v4, p0, Lsw5;->f0:J

    .line 21
    .line 22
    iget-boolean v6, p0, Lsw5;->g0:Z

    .line 23
    .line 24
    iget v7, p0, Lsw5;->h0:F

    .line 25
    .line 26
    invoke-static/range {v0 .. v9}, Lxw5;->a(Lkx4;JFJIFLlp2;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    return-object p0
.end method
