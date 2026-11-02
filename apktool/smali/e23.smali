.class public final Le23;
.super Lw18;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic e:B

.field public final synthetic f:Lh23;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lh23;ILjava/util/List;)V
    .locals 0

    const/4 p4, 0x1

    iput-byte p4, p0, Le23;->e:B

    iput-object p2, p0, Le23;->f:Lh23;

    iput p3, p0, Le23;->g:I

    .line 13
    invoke-direct {p0, p1, p4}, Lw18;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh23;ILjava/util/List;Z)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    .line 2
    iput-byte p4, p0, Le23;->e:B

    .line 3
    .line 4
    iput-object p2, p0, Le23;->f:Lh23;

    .line 5
    .line 6
    iput p3, p0, Le23;->g:I

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-direct {p0, p1, p2}, Lw18;-><init>(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    iget-byte v0, p0, Le23;->e:B

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/16 v3, 0x9

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Le23;->f:Lh23;

    .line 11
    .line 12
    iget-object v0, v0, Lh23;->m0:Lqe4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Le23;->f:Lh23;

    .line 18
    .line 19
    iget-object v0, v0, Lh23;->y0:Lp23;

    .line 20
    .line 21
    iget v4, p0, Le23;->g:I

    .line 22
    .line 23
    invoke-virtual {v0, v4, v3}, Lp23;->D(II)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Le23;->f:Lh23;

    .line 27
    .line 28
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    iget-object v3, p0, Le23;->f:Lh23;

    .line 30
    .line 31
    iget-object v3, v3, Lh23;->A0:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    iget p0, p0, Le23;->g:I

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {v3, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    monitor-exit v0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    monitor-exit v0

    .line 46
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    :goto_0
    return-wide v1

    .line 48
    :pswitch_0
    iget-object v0, p0, Le23;->f:Lh23;

    .line 49
    .line 50
    iget-object v0, v0, Lh23;->m0:Lqe4;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :try_start_3
    iget-object v0, p0, Le23;->f:Lh23;

    .line 56
    .line 57
    iget-object v0, v0, Lh23;->y0:Lp23;

    .line 58
    .line 59
    iget v4, p0, Le23;->g:I

    .line 60
    .line 61
    invoke-virtual {v0, v4, v3}, Lp23;->D(II)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Le23;->f:Lh23;

    .line 65
    .line 66
    monitor-enter v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 67
    :try_start_4
    iget-object v3, p0, Le23;->f:Lh23;

    .line 68
    .line 69
    iget-object v3, v3, Lh23;->A0:Ljava/util/LinkedHashSet;

    .line 70
    .line 71
    iget p0, p0, Le23;->g:I

    .line 72
    .line 73
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {v3, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 78
    .line 79
    .line 80
    :try_start_5
    monitor-exit v0

    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    monitor-exit v0

    .line 84
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 85
    :catch_1
    :goto_1
    return-wide v1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
