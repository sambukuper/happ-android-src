.class public final Lhk0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfk6;


# instance fields
.field public final synthetic b:B

.field public final c:Lfk6;


# direct methods
.method public constructor <init>(JB)V
    .locals 1

    .line 1
    iput-byte p3, p0, Lhk0;->b:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p3, Lhk0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p3, p1, p2, v0}, Lhk0;-><init>(JB)V

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, Lhk0;->c:Lfk6;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p3, Lxa8;

    .line 22
    .line 23
    new-instance v0, Lgk0;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2}, Lgk0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p3, p1, p2, v0}, Lxa8;-><init>(JLfk6;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lhk0;->c:Lfk6;

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-byte v0, p0, Lhk0;->b:B

    .line 2
    .line 3
    iget-object p0, p0, Lhk0;->c:Lfk6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lxa8;

    .line 9
    .line 10
    iget-wide v0, p0, Lxa8;->b:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    check-cast p0, Lhk0;

    .line 14
    .line 15
    iget-object p0, p0, Lhk0;->c:Lfk6;

    .line 16
    .line 17
    check-cast p0, Lxa8;

    .line 18
    .line 19
    iget-wide v0, p0, Lxa8;->b:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lfk0;)Lek6;
    .locals 1

    .line 1
    iget-byte v0, p0, Lhk0;->b:B

    .line 2
    .line 3
    iget-object p0, p0, Lhk0;->c:Lfk6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lxa8;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lxa8;->b(Lfk0;)Lek6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Lhk0;

    .line 16
    .line 17
    iget-object p0, p0, Lhk0;->c:Lfk6;

    .line 18
    .line 19
    check-cast p0, Lxa8;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lxa8;->b(Lfk0;)Lek6;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-boolean p0, p0, Lek6;->b:Z

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    iget-object p0, p1, Lfk0;->c:Ljava/lang/Throwable;

    .line 30
    .line 31
    instance-of p1, p0, Lvl0;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const-string p1, "CameraX"

    .line 36
    .line 37
    invoke-static {p1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    check-cast p0, Lvl0;

    .line 41
    .line 42
    iget p0, p0, Lvl0;->X:I

    .line 43
    .line 44
    if-lez p0, :cond_0

    .line 45
    .line 46
    sget-object p0, Lek6;->f:Lek6;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object p0, Lek6;->d:Lek6;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget-object p0, Lek6;->e:Lek6;

    .line 53
    .line 54
    :goto_0
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
