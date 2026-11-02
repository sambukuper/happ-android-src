.class public final synthetic Lo61;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsd0;
.implements Lokhttp3/internal/dns/DnsQuery$Factory;
.implements Lp95;
.implements Lu4;
.implements La85;
.implements Lr51;
.implements Lf53;
.implements Lkd3;
.implements Lvu;
.implements Lzn2;
.implements Lw4;
.implements Lfa5;
.implements Lp63;
.implements Lj6;
.implements Lbd6;
.implements Lcr0;
.implements Llx8;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lo61;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lo61;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public C(Landroid/view/View;Lw19;)Lw19;
    .locals 6

    .line 1
    iget-byte v0, p0, Lo61;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x207

    .line 5
    .line 6
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Ld08;

    .line 12
    .line 13
    iget-object p1, p0, Ld08;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v0, p2, Lw19;->a:Lt19;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lt19;->h(I)Lfe3;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v4, 0x40

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Lt19;->h(I)Lfe3;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v3, v5}, Lfe3;->b(Lfe3;Lfe3;)Lfe3;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v0, v2}, Lt19;->i(I)Lfe3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v4}, Lt19;->i(I)Lfe3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v2, v0}, Lfe3;->b(Lfe3;Lfe3;)Lfe3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v2, p0, Ld08;->c:Lfe3;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lfe3;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    iget-object v2, p0, Ld08;->d:Lfe3;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lfe3;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    :cond_0
    iput-object v3, p0, Ld08;->c:Lfe3;

    .line 60
    .line 61
    iput-object v0, p0, Ld08;->d:Lfe3;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    sub-int/2addr p0, v1

    .line 68
    :goto_0
    if-ltz p0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lvx5;

    .line 75
    .line 76
    iput-object v3, v1, Lvx5;->c:Lfe3;

    .line 77
    .line 78
    iput-object v0, v1, Lvx5;->d:Lfe3;

    .line 79
    .line 80
    invoke-virtual {v1}, Lvx5;->c()V

    .line 81
    .line 82
    .line 83
    add-int/lit8 p0, p0, -0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    return-object p2

    .line 87
    :pswitch_0
    check-cast p0, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 88
    .line 89
    sget v0, Lsu/happ/proxyutility/ui/BaseActivity;->P0:I

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v0, p2, Lw19;->a:Lt19;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lt19;->h(I)Lfe3;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget v1, v1, Lfe3;->b:I

    .line 101
    .line 102
    iput v1, p0, Lsu/happ/proxyutility/ui/BaseActivity;->J0:I

    .line 103
    .line 104
    const/4 v1, 0x2

    .line 105
    invoke-virtual {v0, v1}, Lt19;->h(I)Lfe3;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget v1, v1, Lfe3;->d:I

    .line 110
    .line 111
    iput v1, p0, Lsu/happ/proxyutility/ui/BaseActivity;->K0:I

    .line 112
    .line 113
    const/16 v1, 0x8

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lt19;->t(I)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const/4 v4, 0x0

    .line 120
    if-eqz v3, :cond_2

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lt19;->h(I)Lfe3;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget v1, v1, Lfe3;->d:I

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    move v1, v4

    .line 130
    :goto_1
    invoke-virtual {v0, v2}, Lt19;->h(I)Lfe3;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget v0, v0, Lfe3;->b:I

    .line 135
    .line 136
    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    if-eqz v3, :cond_4

    .line 144
    .line 145
    move v4, v1

    .line 146
    :cond_4
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {p1, p0, v0, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 155
    .line 156
    .line 157
    return-object p2

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public K(Ljava/lang/Object;Led6;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->g:Ljc4;

    .line 6
    .line 7
    check-cast p1, Ld43;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v1, Lih5;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->f:Landroidx/work/WorkerParameters;

    .line 15
    .line 16
    iget-object v2, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lec4;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-direct {v1, v2, p0}, Lih5;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, p2, p0}, Ld43;->l(Lr43;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljc4;->b()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    invoke-virtual {v0}, Ljc4;->b()V

    .line 50
    .line 51
    .line 52
    throw p0
.end method

.method public M(Ls57;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lzz2;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lzz2;->M(Ls57;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lo61;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lt16;

    .line 9
    .line 10
    sget v0, Lsu/happ/proxyutility/ui/ScScannerActivity;->R0:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lt16;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Loj4;

    .line 17
    .line 18
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Loj4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast p0, Loj4;

    .line 25
    .line 26
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Loj4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    check-cast p0, Lsn;

    .line 12
    invoke-virtual {p0, p1}, Lsn;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Lxb4;
    .locals 0

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lvj2;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lvj2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxb4;

    .line 10
    .line 11
    return-object p0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyg7;

    .line 4
    .line 5
    iget-object v0, p0, Lyg7;->i0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    iget-object p0, p0, Lyg7;->n0:Landroid/view/View$OnLongClickListener;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, p0, v1}, Lue3;->m0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lo61;->X:B

    .line 2
    .line 3
    const/16 v1, 0x2000

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    check-cast p0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;

    .line 13
    .line 14
    check-cast p1, Li6;

    .line 15
    .line 16
    sget v0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;->X0:I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Li6;->Y:Landroid/content/Intent;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v3

    .line 31
    :goto_0
    iget p1, p1, Li6;->X:I

    .line 32
    .line 33
    if-ne p1, v2, :cond_3

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    :try_start_1
    sget-object v0, Liq0;->a:Ljava/nio/charset/Charset;

    .line 48
    .line 49
    new-instance v2, Ljava/io/InputStreamReader;

    .line 50
    .line 51
    invoke-direct {v2, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/io/BufferedReader;

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ldt7;->e(Ljava/io/Reader;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    move-object v0, v3

    .line 67
    :goto_1
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;->C(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_2
    invoke-static {p1, v3}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    :try_start_4
    invoke-static {p1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 80
    :catchall_2
    move-exception p0

    .line 81
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 82
    .line 83
    if-nez p1, :cond_2

    .line 84
    .line 85
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 86
    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    throw p0

    .line 91
    :cond_3
    :goto_3
    return-void

    .line 92
    :pswitch_1
    check-cast p0, Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 93
    .line 94
    check-cast p1, Landroid/net/Uri;

    .line 95
    .line 96
    sget v0, Lsu/happ/proxyutility/ui/ScannerActivity;->T0:I

    .line 97
    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "empty"

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/ui/ScannerActivity;->B(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_4
    :try_start_5
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    sget v0, La26;->a:I

    .line 121
    .line 122
    invoke-static {p1}, La26;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/ui/ScannerActivity;->B(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :catchall_3
    move-exception p1

    .line 133
    goto :goto_5

    .line 134
    :cond_5
    const-string p1, "error"

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/ui/ScannerActivity;->B(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_4
    sget-object v3, Ldn8;->a:Ldn8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :goto_5
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 143
    .line 144
    if-nez v0, :cond_8

    .line 145
    .line 146
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 147
    .line 148
    if-nez v0, :cond_8

    .line 149
    .line 150
    new-instance v3, Lrj6;

    .line 151
    .line 152
    invoke-direct {v3, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    :goto_6
    invoke-static {v3}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {p0, p1}, Lx79;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    :goto_7
    return-void

    .line 173
    :cond_8
    throw p1

    .line 174
    :pswitch_2
    check-cast p0, Lsu/happ/proxyutility/ui/ScScannerActivity;

    .line 175
    .line 176
    check-cast p1, Li6;

    .line 177
    .line 178
    sget v0, Lsu/happ/proxyutility/ui/ScScannerActivity;->R0:I

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget v0, p1, Li6;->X:I

    .line 184
    .line 185
    if-ne v0, v2, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, Ljy2;

    .line 196
    .line 197
    const/16 v2, 0x1c

    .line 198
    .line 199
    invoke-direct {v1, p1, p0, v3, v2}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 200
    .line 201
    .line 202
    const/4 p1, 0x3

    .line 203
    invoke-static {v0, v3, v1, p1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_3
    check-cast p0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 211
    .line 212
    check-cast p1, Li6;

    .line 213
    .line 214
    sget v0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v0, p1, Li6;->Y:Landroid/content/Intent;

    .line 220
    .line 221
    if-eqz v0, :cond_a

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    :cond_a
    iget p1, p1, Li6;->X:I

    .line 228
    .line 229
    if-ne p1, v2, :cond_c

    .line 230
    .line 231
    if-eqz v3, :cond_c

    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-eqz p1, :cond_c

    .line 242
    .line 243
    sget-object v0, Liq0;->a:Ljava/nio/charset/Charset;

    .line 244
    .line 245
    new-instance v2, Ljava/io/InputStreamReader;

    .line 246
    .line 247
    invoke-direct {v2, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 248
    .line 249
    .line 250
    new-instance p1, Ljava/io/BufferedReader;

    .line 251
    .line 252
    invoke-direct {p1, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 253
    .line 254
    .line 255
    :try_start_6
    invoke-static {p1}, Ldt7;->e(Ljava/io/Reader;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    const/16 v1, 0x2c

    .line 260
    .line 261
    const/16 v2, 0xa

    .line 262
    .line 263
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->B()Lcl5;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1, v0}, Lcl5;->g(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    sget v0, Ly46;->toast_success:I

    .line 281
    .line 282
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    sget-object v1, Lmy2;->X:Lmy2;

    .line 290
    .line 291
    invoke-virtual {p0, v0, v1}, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->C(Ljava/lang/String;Lmy2;)V

    .line 292
    .line 293
    .line 294
    goto :goto_8

    .line 295
    :catchall_4
    move-exception p0

    .line 296
    goto :goto_9

    .line 297
    :cond_b
    sget v0, Ly46;->toast_failure:I

    .line 298
    .line 299
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object v1, Lmy2;->Y:Lmy2;

    .line 307
    .line 308
    invoke-virtual {p0, v0, v1}, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->C(Ljava/lang/String;Lmy2;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 309
    .line 310
    .line 311
    :goto_8
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 312
    .line 313
    .line 314
    goto :goto_a

    .line 315
    :goto_9
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 316
    :catchall_5
    move-exception v0

    .line 317
    invoke-static {p1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :cond_c
    :goto_a
    return-void

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lo61;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    :try_start_0
    sget-object v0, Lxn8;->a:Lxn8;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lxn8;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    const-string v2, "Unable to create instance of "

    .line 20
    .line 21
    const-string v3, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 22
    .line 23
    invoke-static {v2, p0, v3}, Lpc6;->n(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0, v0}, Lxw3;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-object v1

    .line 31
    :pswitch_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 32
    .line 33
    const-string v0, "\' with no args"

    .line 34
    .line 35
    const-string v2, "Failed to invoke constructor \'"

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    goto :goto_1

    .line 42
    :catch_1
    move-exception p0

    .line 43
    sget-object v0, Lec6;->a:Ldh3;

    .line 44
    .line 45
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 46
    .line 47
    invoke-static {v0, p0}, Lxw3;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_2
    move-exception v3

    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Lec6;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {p0, v0}, Lxw3;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-object v1

    .line 79
    :catch_3
    move-exception v1

    .line 80
    new-instance v3, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    invoke-static {p0}, Lec6;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {v3, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw v3

    .line 105
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public e(Llr;)Lro0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, Lo61;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lso0;

    .line 8
    .line 9
    iget-object v2, v1, Llr;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/net/URL;

    .line 12
    .line 13
    const-string v3, "CctTransportBackend"

    .line 14
    .line 15
    invoke-static {v3}, Lmb6;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x4

    .line 20
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v6, "Making request to: %s"

    .line 31
    .line 32
    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 40
    .line 41
    const/16 v4, 0x7530

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 44
    .line 45
    .line 46
    const v4, 0x1fbd0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 54
    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 58
    .line 59
    .line 60
    const-string v4, "POST"

    .line 61
    .line 62
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v4, "User-Agent"

    .line 66
    .line 67
    const-string v6, "datatransport/3.1.9 android/"

    .line 68
    .line 69
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v4, "Content-Encoding"

    .line 73
    .line 74
    const-string v6, "gzip"

    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v7, "application/json"

    .line 80
    .line 81
    const-string v8, "Content-Type"

    .line 82
    .line 83
    invoke-virtual {v2, v8, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v7, "Accept-Encoding"

    .line 87
    .line 88
    invoke-virtual {v2, v7, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v7, v1, Llr;->f0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v7, :cond_1

    .line 96
    .line 97
    const-string v9, "X-Goog-Api-Key"

    .line 98
    .line 99
    invoke-virtual {v2, v9, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 103
    .line 104
    .line 105
    move-result-object v10
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lz02; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 106
    :try_start_1
    new-instance v11, Ljava/util/zip/GZIPOutputStream;

    .line 107
    .line 108
    invoke-direct {v11, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 109
    .line 110
    .line 111
    :try_start_2
    iget-object v0, v0, Lso0;->a:Lq02;

    .line 112
    .line 113
    iget-object v1, v1, Llr;->Z:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Ltx;

    .line 116
    .line 117
    new-instance v13, Ljava/io/BufferedWriter;

    .line 118
    .line 119
    new-instance v12, Ljava/io/OutputStreamWriter;

    .line 120
    .line 121
    invoke-direct {v12, v11}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v13, v12}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 125
    .line 126
    .line 127
    new-instance v12, Lcs3;

    .line 128
    .line 129
    iget-object v0, v0, Lq02;->Y:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lsn3;

    .line 132
    .line 133
    iget-object v14, v0, Lsn3;->a:Ljava/util/HashMap;

    .line 134
    .line 135
    iget-object v7, v0, Lsn3;->b:Ljava/util/HashMap;

    .line 136
    .line 137
    iget-object v9, v0, Lsn3;->c:Lpn3;

    .line 138
    .line 139
    iget-boolean v0, v0, Lsn3;->d:Z

    .line 140
    .line 141
    move/from16 v17, v0

    .line 142
    .line 143
    move-object v15, v7

    .line 144
    move-object/from16 v16, v9

    .line 145
    .line 146
    invoke-direct/range {v12 .. v17}, Lcs3;-><init>(Ljava/io/BufferedWriter;Ljava/util/HashMap;Ljava/util/HashMap;Lpn3;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v1}, Lcs3;->f(Ljava/lang/Object;)Lcs3;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12}, Lcs3;->h()V

    .line 153
    .line 154
    .line 155
    iget-object v0, v12, Lcs3;->b:Landroid/util/JsonWriter;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 158
    .line 159
    .line 160
    :try_start_3
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 161
    .line 162
    .line 163
    if-eqz v10, :cond_2

    .line 164
    .line 165
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lz02; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :catch_0
    const-wide/16 v4, 0x0

    .line 170
    .line 171
    const/4 v6, 0x0

    .line 172
    goto/16 :goto_c

    .line 173
    .line 174
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v3}, Lmb6;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_3

    .line 191
    .line 192
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const-string v5, "Status Code: %d"

    .line 197
    .line 198
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    :cond_3
    const-string v1, "Content-Type: %s"

    .line 202
    .line 203
    invoke-virtual {v2, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v5, v3, v1}, Lmb6;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const-string v1, "Content-Encoding: %s"

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v5, v3, v1}, Lmb6;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/16 v1, 0x12e

    .line 220
    .line 221
    if-eq v0, v1, :cond_b

    .line 222
    .line 223
    const/16 v1, 0x12d

    .line 224
    .line 225
    if-eq v0, v1, :cond_b

    .line 226
    .line 227
    const/16 v1, 0x133

    .line 228
    .line 229
    if-ne v0, v1, :cond_4

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_4
    const/16 v1, 0xc8

    .line 233
    .line 234
    if-eq v0, v1, :cond_5

    .line 235
    .line 236
    new-instance v1, Lro0;

    .line 237
    .line 238
    const-wide/16 v2, 0x0

    .line 239
    .line 240
    const/4 v4, 0x0

    .line 241
    invoke-direct {v1, v0, v4, v2, v3}, Lro0;-><init>(ILjava/net/URL;J)V

    .line 242
    .line 243
    .line 244
    return-object v1

    .line 245
    :cond_5
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :try_start_5
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_6

    .line 258
    .line 259
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 260
    .line 261
    invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 262
    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_6
    move-object v2, v1

    .line 266
    :goto_1
    :try_start_6
    new-instance v3, Ljava/io/BufferedReader;

    .line 267
    .line 268
    new-instance v4, Ljava/io/InputStreamReader;

    .line 269
    .line 270
    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v3}, Lvy;->a(Ljava/io/BufferedReader;)Lvy;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    iget-wide v3, v3, Lvy;->a:J

    .line 281
    .line 282
    new-instance v5, Lro0;

    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    invoke-direct {v5, v0, v6, v3, v4}, Lro0;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 286
    .line 287
    .line 288
    if-eqz v2, :cond_7

    .line 289
    .line 290
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :catchall_0
    move-exception v0

    .line 295
    move-object v2, v0

    .line 296
    goto :goto_4

    .line 297
    :cond_7
    :goto_2
    if-eqz v1, :cond_8

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 300
    .line 301
    .line 302
    :cond_8
    return-object v5

    .line 303
    :catchall_1
    move-exception v0

    .line 304
    move-object v3, v0

    .line 305
    if-eqz v2, :cond_9

    .line 306
    .line 307
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :catchall_2
    move-exception v0

    .line 312
    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    :cond_9
    :goto_3
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 316
    :goto_4
    if-eqz v1, :cond_a

    .line 317
    .line 318
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :catchall_3
    move-exception v0

    .line 323
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :cond_a
    :goto_5
    throw v2

    .line 327
    :cond_b
    :goto_6
    const-string v1, "Location"

    .line 328
    .line 329
    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    new-instance v2, Lro0;

    .line 334
    .line 335
    new-instance v3, Ljava/net/URL;

    .line 336
    .line 337
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    const-wide/16 v4, 0x0

    .line 341
    .line 342
    invoke-direct {v2, v0, v3, v4, v5}, Lro0;-><init>(ILjava/net/URL;J)V

    .line 343
    .line 344
    .line 345
    return-object v2

    .line 346
    :catchall_4
    move-exception v0

    .line 347
    move-object v1, v0

    .line 348
    goto :goto_a

    .line 349
    :goto_7
    move-object v1, v0

    .line 350
    goto :goto_8

    .line 351
    :catchall_5
    move-exception v0

    .line 352
    goto :goto_7

    .line 353
    :goto_8
    :try_start_b
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 354
    .line 355
    .line 356
    goto :goto_9

    .line 357
    :catchall_6
    move-exception v0

    .line 358
    :try_start_c
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    :goto_9
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 362
    :goto_a
    if-eqz v10, :cond_c

    .line 363
    .line 364
    :try_start_d
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 365
    .line 366
    .line 367
    goto :goto_b

    .line 368
    :catchall_7
    move-exception v0

    .line 369
    :try_start_e
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    :cond_c
    :goto_b
    throw v1
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_0
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_0
    .catch Lz02; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1

    .line 373
    :catch_1
    invoke-static {v3}, Lmb6;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    new-instance v0, Lro0;

    .line 377
    .line 378
    const/16 v1, 0x190

    .line 379
    .line 380
    const-wide/16 v4, 0x0

    .line 381
    .line 382
    const/4 v6, 0x0

    .line 383
    invoke-direct {v0, v1, v6, v4, v5}, Lro0;-><init>(ILjava/net/URL;J)V

    .line 384
    .line 385
    .line 386
    goto :goto_d

    .line 387
    :goto_c
    invoke-static {v3}, Lmb6;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    new-instance v0, Lro0;

    .line 391
    .line 392
    const/16 v1, 0x1f4

    .line 393
    .line 394
    invoke-direct {v0, v1, v6, v4, v5}, Lro0;-><init>(ILjava/net/URL;J)V

    .line 395
    .line 396
    .line 397
    :goto_d
    return-object v0
.end method

.method public f(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;

    .line 4
    .line 5
    sget p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->s0:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->c()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public g(Lfb9;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly5;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lfb9;->i()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lfb9;->f()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "FID_ALREADY_USED:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Ly5;->g0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lnb2;

    .line 46
    .line 47
    check-cast p1, Lmb2;

    .line 48
    .line 49
    iget-object p1, p1, Lmb2;->c:Lzz2;

    .line 50
    .line 51
    invoke-virtual {p1}, Lzz2;->k0()Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ly5;->Y()Lfb9;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_1
    :goto_0
    return-object p1
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrn2;

    .line 4
    .line 5
    sget-object v0, Lkd7;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lkd7;->h:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v1, p0}, Lwv0;->D0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sput-object p0, Lkd7;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0

    .line 20
    throw p0
.end method

.method public i(Lfb9;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ly9;

    .line 16
    .line 17
    const/16 v2, 0xb

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p0, p1, v3, v2}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public j(Lq02;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    and-int/2addr p2, v2

    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    :try_start_0
    iget-object p2, p1, Lq02;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lmd3;

    .line 18
    .line 19
    invoke-interface {p2}, Lmd3;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    iget-object p2, p1, Lq02;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, Lmd3;

    .line 25
    .line 26
    invoke-interface {p2}, Lmd3;->h()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Landroid/os/Parcelable;

    .line 31
    .line 32
    if-nez p3, :cond_0

    .line 33
    .line 34
    new-instance p3, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    move-object p3, v1

    .line 46
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 47
    .line 48
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance p2, Landroid/content/ClipData;

    .line 52
    .line 53
    iget-object p1, p1, Lq02;->Y:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lmd3;

    .line 56
    .line 57
    invoke-interface {p1}, Lmd3;->a()Landroid/content/ClipDescription;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, Landroid/content/ClipData$Item;

    .line 62
    .line 63
    invoke-interface {p1}, Lmd3;->e()Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-direct {v3, v4}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p2, v1, v3}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x1f

    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    if-lt v0, v1, :cond_2

    .line 77
    .line 78
    new-instance v0, Lp41;

    .line 79
    .line 80
    invoke-direct {v0, p2, v3}, Lp41;-><init>(Landroid/content/ClipData;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    new-instance v0, Lr41;

    .line 85
    .line 86
    invoke-direct {v0}, Lr41;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p2, v0, Lr41;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iput-byte v3, v0, Lr41;->c:B

    .line 92
    .line 93
    :goto_1
    invoke-interface {p1}, Lmd3;->g()Landroid/net/Uri;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {v0, p1}, Lq41;->b(Landroid/net/Uri;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, p3}, Lq41;->setExtras(Landroid/os/Bundle;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Lq41;->build()Lt41;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p0, p1}, Lcw8;->j(Landroidx/appcompat/widget/AppCompatEditText;Lt41;)Lt41;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    return v2

    .line 114
    :catch_0
    :cond_3
    const/4 p0, 0x0

    .line 115
    return p0
.end method

.method public k(Lq63;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcv4;

    .line 4
    .line 5
    iget-object v0, p0, Lcv4;->X:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget v1, p0, Lcv4;->Z:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iput v1, p0, Lcv4;->Z:I

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0, p1}, Lcv4;->i(Lq63;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public newQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 0

    .line 1
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lokhttp3/android/AndroidDns;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lokhttp3/android/AndroidDns;->b(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public t(Lqd0;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lo61;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lo61;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lzl0;

    .line 9
    .line 10
    iget-object v0, p0, Lzl0;->n:Lek0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lek0;->f()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lzl0;->o:Lvz7;

    .line 16
    .line 17
    invoke-virtual {v0}, Lvz7;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lzl0;->o:Lvz7;

    .line 24
    .line 25
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ldm6;

    .line 30
    .line 31
    iget-object v1, v0, Ldm6;->a:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    iget-object v2, v0, Ldm6;->b:Lam6;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Ldm6;->c:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 42
    .line 43
    .line 44
    const/4 v2, -0x1

    .line 45
    iput v2, v0, Ldm6;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v1

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    monitor-exit v1

    .line 51
    throw p0

    .line 52
    :cond_0
    :goto_0
    iget-object v0, p0, Lzl0;->a:Ljk0;

    .line 53
    .line 54
    iget-object v1, v0, Ljk0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter v1

    .line 57
    :try_start_1
    iget-object v2, v0, Ljk0;->b:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    iget-object v3, v0, Ljk0;->d:Lxb4;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    :try_start_2
    sget-object v3, Lu73;->Z:Lu73;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    goto :goto_4

    .line 74
    :cond_1
    :goto_1
    monitor-exit v1

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    if-nez v3, :cond_3

    .line 77
    .line 78
    new-instance v2, Lo61;

    .line 79
    .line 80
    const/4 v3, 0x4

    .line 81
    invoke-direct {v2, v0, v3}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lu15;->u(Lsd0;)Lud0;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iput-object v3, v0, Ljk0;->d:Lxb4;

    .line 89
    .line 90
    :cond_3
    iget-object v2, v0, Ljk0;->c:Ljava/util/HashSet;

    .line 91
    .line 92
    iget-object v4, v0, Ljk0;->b:Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v2, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, Ljk0;->b:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Lcj0;

    .line 122
    .line 123
    invoke-interface {v4}, Lcj0;->a()Lxb4;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    new-instance v6, Lsc;

    .line 128
    .line 129
    const/4 v7, 0x7

    .line 130
    invoke-direct {v6, v0, v4, v7}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-interface {v5, v6, v4}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    iget-object v0, v0, Ljk0;->b:Ljava/util/LinkedHashMap;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 144
    .line 145
    .line 146
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 147
    :goto_3
    new-instance v0, Lsc;

    .line 148
    .line 149
    const/16 v1, 0x9

    .line 150
    .line 151
    invoke-direct {v0, p0, p1, v1}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    iget-object p0, p0, Lzl0;->d:Ljava/util/concurrent/Executor;

    .line 155
    .line 156
    invoke-interface {v3, v0, p0}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 157
    .line 158
    .line 159
    const-string p0, "CameraX shutdownInternal"

    .line 160
    .line 161
    return-object p0

    .line 162
    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    throw p0

    .line 164
    :sswitch_0
    check-cast p0, Ljk0;

    .line 165
    .line 166
    iget-object v0, p0, Ljk0;->a:Ljava/lang/Object;

    .line 167
    .line 168
    monitor-enter v0

    .line 169
    :try_start_4
    iput-object p1, p0, Ljk0;->e:Lqd0;

    .line 170
    .line 171
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 172
    const-string p0, "CameraRepository-deinit"

    .line 173
    .line 174
    return-object p0

    .line 175
    :catchall_2
    move-exception p0

    .line 176
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 177
    throw p0

    .line 178
    :sswitch_1
    check-cast p0, Lrm3;

    .line 179
    .line 180
    const-string v0, "Job.asListenableFuture"

    .line 181
    .line 182
    new-instance v1, Ly0;

    .line 183
    .line 184
    const/16 v2, 0x13

    .line 185
    .line 186
    invoke-direct {v1, p1, v2}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v1}, Lrm3;->D(Lgn2;)Lgq1;

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method
