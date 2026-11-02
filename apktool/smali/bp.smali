.class public final Lbp;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lbp;

.field public static final c:Lbp;


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbp;

    .line 2
    .line 3
    sget-wide v1, Ldw0;->c:J

    .line 4
    .line 5
    const v3, 0x3e99999a    # 0.3f

    .line 6
    .line 7
    .line 8
    invoke-static {v3, v1, v2}, Ldw0;->b(FJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-direct {v0, v1, v2}, Lbp;-><init>(J)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lbp;->b:Lbp;

    .line 16
    .line 17
    new-instance v0, Lbp;

    .line 18
    .line 19
    sget-wide v1, Ldw0;->b:J

    .line 20
    .line 21
    invoke-static {v3, v1, v2}, Ldw0;->b(FJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-direct {v0, v1, v2}, Lbp;-><init>(J)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lbp;->c:Lbp;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lbp;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lbp;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lbp;

    .line 10
    .line 11
    iget-wide v0, p1, Lbp;->a:J

    .line 12
    .line 13
    sget p1, Ldw0;->h:I

    .line 14
    .line 15
    iget-wide p0, p0, Lbp;->a:J

    .line 16
    .line 17
    invoke-static {p0, p1, v0, v1}, Ltk8;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Ldw0;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lbp;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lbp;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ldw0;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "AppBottomSheetColors(dragHandle="

    .line 8
    .line 9
    const-string v1, ")"

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
