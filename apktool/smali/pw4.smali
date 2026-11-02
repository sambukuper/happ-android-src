.class public final synthetic Lpw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:J

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Z

.field public final synthetic f0:Z


# direct methods
.method public synthetic constructor <init>(JLdn2;ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lpw4;->X:J

    .line 5
    .line 6
    iput-object p3, p0, Lpw4;->Y:Ldn2;

    .line 7
    .line 8
    iput-boolean p4, p0, Lpw4;->Z:Z

    .line 9
    .line 10
    iput-boolean p5, p0, Lpw4;->f0:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lw79;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-wide v0, p0, Lpw4;->X:J

    .line 15
    .line 16
    iget-object v2, p0, Lpw4;->Y:Ldn2;

    .line 17
    .line 18
    iget-boolean v3, p0, Lpw4;->Z:Z

    .line 19
    .line 20
    iget-boolean v4, p0, Lpw4;->f0:Z

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Lzw4;->c(JLdn2;ZZLlp2;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ldn8;->a:Ldn8;

    .line 26
    .line 27
    return-object p0
.end method
